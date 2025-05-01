package com.m1ddler.spring.mvc_hibernate_aop.controller;

import com.m1ddler.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.m1ddler.spring.mvc_hibernate_aop.entity.Employee;
import com.m1ddler.spring.mvc_hibernate_aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {
    private final EmployeeService employeeService;

    @Autowired
    public MyController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/employees")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmployees", allEmployees);
        System.out.println("Controller: showAllEmployees() called");
        return "all-employees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

    @RequestMapping("/updateEmployee")
    public String updateEmployee(@RequestParam("empId") int empId, Model model) {
        model.addAttribute("employee", employeeService.getEmployeeById(empId));
        return "employee-info";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int empId) {
        employeeService.deleteEmployee(empId);
        return "redirect:/employees";
    }
}
