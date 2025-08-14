package aug6.lab4.prog3.cg.eis.pl;

import java.util.List;
import java.util.Scanner;
import aug6.lab4.prog3.cg.eis.bean.Employee;
import aug6.lab4.prog3.cg.eis.exception.EmployeeException;
import aug6.lab4.prog3.cg.eis.service.EmployeeServiceImplementation;

public class Prog3 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EmployeeServiceImplementation service = new EmployeeServiceImplementation();
        Prog3 prog3 = new Prog3();
        String fileName = "employees.txt";
        try {
            Employee emp = prog3.inputDetails();
            emp.setInsuranceScheme(service.determineInsuranceScheme(emp));
            service.displayDetails(emp);
            service.writeEmployeeToFile(emp, fileName);
            List<Employee> employees = service.readEmployeesFromFile(fileName);
            for (Employee e : employees) {
                System.out.println("--------------------------");
                service.displayDetails(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Employee inputDetails() throws EmployeeException {
        System.out.println("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter Designation no \n1)Cat-A\n2)Cat-B\n3)Cat-C\n");
        int des = scanner.nextInt();
        String designation = (des == 1) ? "Cat-A" : ((des == 2) ? "Cat-B" : "Cat-C");
        return new Employee(id, name, salary, designation);
    }
}
