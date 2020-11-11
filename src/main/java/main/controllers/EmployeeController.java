package main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import main.model.Employee;
import main.services.EmployeeService;

@RestController
//?????
@CrossOrigin(origins = "*")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //how to request by id
    /*
	 * @GetMapping("/employees") public List<Employee> findAllEmployees() { //return
	 * employeeService.findAll(); return new
	 * ResponseEntity(employeeService.findAll(),HttpStatus); }
	 */
    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return employeeService.findAll();
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    void replaceEmployee(@RequestBody Employee newEmployee, @PathVariable String id) {
        employeeService.updateEmployee(newEmployee, id);
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployee(id);
    }

}