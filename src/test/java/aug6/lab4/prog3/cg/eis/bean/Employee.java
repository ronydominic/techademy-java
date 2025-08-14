package aug6.lab4.prog3.cg.eis.bean;

import aug6.lab4.prog3.cg.eis.exception.EmployeeException;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	public Employee(int id, String name, double salary, String designation) throws EmployeeException {
		super();
		this.id = id;
		this.name = name;
		if(salary < 3000) {
		 throw new EmployeeException("Low salary exception");
		}
		else {
			this.salary = salary;
		}
		this.designation = designation;
	
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) throws EmployeeException {
		if(salary < 3000) {
			 throw new EmployeeException("Low salary exception");
			}
			else {
				this.salary = salary;
			}
		}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	

}
