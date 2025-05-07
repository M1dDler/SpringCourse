package com.m1ddler.spring.rest;

import com.m1ddler.spring.rest.configuration.MyConfig;
import com.m1ddler.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication comm = context.getBean(Communication.class);
//        List<Employee> employeeList = comm.showAllEmployees();
//        for (Employee employee : employeeList) {
//            System.out.println(employee);
//        }

//        System.out.println(comm.getEmployeeById(10));

//        Employee emp = new Employee("Jack", "Smith", "QA", 7000);
//        emp.setEmpId(19);
//        comm.addEmployee(emp);

        comm.deleteEmployee(19);
        context.close();
    }
}
