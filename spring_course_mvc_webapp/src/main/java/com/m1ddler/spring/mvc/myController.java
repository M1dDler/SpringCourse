package com.m1ddler.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee", new Employee());
        return "ask-employee-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute ("employee") Employee employee){
        String name = employee.getName();
        employee.setName("Mr " + name);
        String surname = employee.getSurname();
        employee.setSurname(surname + "!");
        int salary = employee.getSalary();
        employee.setSalary(salary * 10);


        return "show-employee-details-view";
    }
}
