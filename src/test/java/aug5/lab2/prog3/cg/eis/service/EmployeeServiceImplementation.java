package aug5.lab2.prog3.cg.eis.service;

import aug5.lab2.prog3.cg.eis.bean.Employee;

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

}
