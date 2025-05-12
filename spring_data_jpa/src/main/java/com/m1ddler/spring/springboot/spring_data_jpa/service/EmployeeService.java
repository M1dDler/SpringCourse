package com.m1ddler.spring.springboot.spring_data_jpa.service;

import com.m1ddler.spring.springboot.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee saveEmployee(Employee employee);
    public Employee getEmployeeById(int empId);
    public void deleteEmployee(int empId);
    public List<Employee> getEmployeesByName(String name);
}
