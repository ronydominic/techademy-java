package aug6.lab4.prog3.cg.eis.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import aug6.lab4.prog3.cg.eis.bean.Employee;
import aug6.lab4.prog3.cg.eis.exception.EmployeeException;

public class EmployeeServiceImplementation implements EmployeeService {
    @Override
    public String determineInsuranceScheme(Employee employee) {
        double salary = employee.getSalary();
        String designation = employee.getDesignation();
        String scheme;

        if (salary >= 50000 && designation.equals("Cat-A")) {
            scheme = "Platinum";
        } else if (salary >= 30000 && designation.equals("Cat-B")) {
            scheme = "Gold";
        } else if (salary >= 20000 && designation.equals("Cat-C")) {
            scheme = "Silver";
        } else {
            scheme = "No Scheme";
        }

        return scheme;
    }
    
    @Override
    public void displayDetails(Employee employee) {
    	// TODO Auto-generated method stub
    	System.out.println("ID               : " + employee.getId());
    	System.out.println("Name             : " + employee.getName());
    	System.out.println("Salary           : " + employee.getSalary());
    	System.out.println("Designation      : " + employee.getDesignation());
    	System.out.println("Insurance Scheme : " + employee.getInsuranceScheme());
    	
    }
    
    @Override
    public void writeEmployeeToFile(Employee employee, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(employee.getId() + "," +
                         employee.getName() + "," +
                         employee.getSalary() + "," +
                         employee.getDesignation() + "," +
                         employee.getInsuranceScheme());
            writer.newLine();
            System.out.println("Employee data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing employee to file: " + e.getMessage());
        }
    }

    public List<Employee> readEmployeesFromFile(String fileName) {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    Employee emp = new Employee();
                    emp.setId(Integer.parseInt(parts[0]));
                    emp.setName(parts[1]);
                    try {
						emp.setSalary(Double.parseDouble(parts[2]));
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (EmployeeException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                    emp.setDesignation(parts[3]);
                    emp.setInsuranceScheme(parts[4]);
                    employees.add(emp);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading employees from file: " + e.getMessage());
        }
        return employees;
    }

}
