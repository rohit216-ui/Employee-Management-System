package employee_mgmt.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import employee_mgmt.Model.Employee;
import employee_mgmt.Service.EmployeeServiceimpli;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeServiceimpli employeeService;

    // List all employees
    @GetMapping
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employees";
    }

    // Show add form
    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee_form";
    }

    // Save employee
    @PostMapping
    public String saveEmployee(@ModelAttribute Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

    // Show edit form
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        return employeeService.getEmployeeById(id)
                .map(emp -> {
                    model.addAttribute("employee", emp);
                    return "employee_form";
                })
                .orElse("redirect:/employees");
    }

    // Delete employee
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/employees";
    }
}