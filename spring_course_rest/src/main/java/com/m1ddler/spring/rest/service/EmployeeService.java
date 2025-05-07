package com.m1ddler.spring.rest.service;

import com.m1ddler.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee saveEmployee(Employee employee);
    public Employee getEmployeeById(int empId);
    public void deleteEmployee(int empId);
}
