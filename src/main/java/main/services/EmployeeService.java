package main.services;

import java.util.*;

import org.springframework.stereotype.Service;

import main.model.Employee;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee("1", "John", "Library"),
            new Employee("2", "Joe", "Security")));
    
    
    
	

    public List<Employee> findAll() {
        return employees;
    }

    public void addEmployee(Employee employee) {
    	employee.setId(Integer.toString(employees.size()+1));
        employees.add(employee);
        
    }

    
    // why updateemployee where has it been used
    public void updateEmployee(Employee updatemployee, String id) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
            	// why .set??
            	employee.setName(updatemployee.getName());
            	employee.setDepartment(updatemployee.getDepartment());
            }
            count++;
        }
    }
    
    

    public void deleteEmployee(String id) {
    
        employees.removeIf(employee -> employee.getId().equals(id));
    }

}