package employee_mgmt.Service;


import java.util.List;
import java.util.Optional;

import employee_mgmt.Model.Employee;


public interface EmployeeServiceimpli {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Optional<Employee> getEmployeeById(Long id);

    public void deleteEmployee(Long id);
}