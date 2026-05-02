package Employee_Management_System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Employee_Management_System.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}