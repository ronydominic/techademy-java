package aug6.lab4.prog3.cg.eis.service;

import java.util.List;

import aug6.lab4.prog3.cg.eis.bean.Employee;

public interface EmployeeService {
    public String determineInsuranceScheme(Employee employee);
    public void displayDetails(Employee employee);
    public void writeEmployeeToFile(Employee employee, String fileName);
    public List<Employee> readEmployeesFromFile(String fileName);


}
