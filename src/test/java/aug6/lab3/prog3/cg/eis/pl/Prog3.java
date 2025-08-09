package aug6.lab3.prog3.cg.eis.pl;

import java.util.Scanner;

import aug6.lab3.prog3.cg.eis.bean.Employee;
import aug6.lab3.prog3.cg.eis.exception.EmployeeException;
import aug6.lab3.prog3.cg.eis.service.EmployeeService;
import aug6.lab3.prog3.cg.eis.service.EmployeeServiceImplementation;

public class Prog3 {
	Scanner  scanner = new Scanner(System.in);

	public static void main(String[] args) {
		EmployeeService service = new EmployeeServiceImplementation();
		
		Prog3 prog3 = new Prog3();
		try {
		Employee emp = prog3.inputDetails();
		String scheme = service.determineInsuranceScheme(emp);
		emp.setInsuranceScheme(scheme);
		service.displayDetails(emp);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	public Employee inputDetails() throws EmployeeException{
		
		EmployeeService service = new EmployeeServiceImplementation();
		System.out.println("Enter Employee ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter employee name: ");
		String name = scanner.nextLine();
		System.out.println("Enter salary: ");
		double salary = scanner.nextDouble();
		System.out.println("Enter Designation no \n1)Cat-A\n2)Cat-B \n3)Cat-C\n");
		int des = scanner.nextInt();
		String designation = (des == 1) ? "Cat-A" :((des == 2)? "Cat-B" : "Cat-C");

		return new Employee(id, name, salary, designation);
		
	}
}
