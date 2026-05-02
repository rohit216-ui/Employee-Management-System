package employee_mgmt.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employee_mgmt.Model.Employee;
import employee_mgmt.Repository.EmployeeRepository;

@Service
public class EmployeeServiceimpl implements EmployeeServiceimpli{

		@Autowired
		EmployeeRepository employeeRepository;
	
	    @Override
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    @Override
	    public void saveEmployee(Employee employee) {
	        employeeRepository.save(employee);
	    }

	    @Override
	    public Optional<Employee> getEmployeeById(Long id) {
	        return employeeRepository.findById(id);
	    }

	    @Override
	    public void deleteEmployee(Long id) {
	        employeeRepository.deleteById(id);
	    }

		
}
