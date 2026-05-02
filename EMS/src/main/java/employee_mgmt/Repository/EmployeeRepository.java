package employee_mgmt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import employee_mgmt.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}