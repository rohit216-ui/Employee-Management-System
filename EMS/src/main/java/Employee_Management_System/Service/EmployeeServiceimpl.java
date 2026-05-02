package Employee_Management_System.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employee_Management_System.Model.Employee;
import Employee_Management_System.Repository.EmployeeRepository;

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
