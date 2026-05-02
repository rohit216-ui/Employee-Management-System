package Employee_Management_System.Service;


import java.util.List;
import java.util.Optional;

import Employee_Management_System.Model.Employee;


public interface EmployeeServiceimpli {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Optional<Employee> getEmployeeById(Long id);

    public void deleteEmployee(Long id);
}