package com.m1ddler.spring.rest.controller;

import com.m1ddler.spring.rest.entity.Employee;
import com.m1ddler.spring.rest.exception_handling.NoSuchEmployeeException;
import com.m1ddler.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
    private final EmployeeService employeeService;

    @Autowired
    public MyRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee showEmployee(@PathVariable Integer employeeId){
        Employee employee = employeeService.getEmployeeById(employeeId);

        if(employee == null){
            throw new NoSuchEmployeeException("There is no employee with ID "+ employeeId +" in the database.");
        }

        return employee;
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        if(employeeService.getEmployeeById(id) == null){
            throw new NoSuchEmployeeException("There is no employee with ID "+ id +" in the database.");
        }
        employeeService.deleteEmployee(id);
        return "Employee with ID " + id + " deleted successfully";
    }

}
