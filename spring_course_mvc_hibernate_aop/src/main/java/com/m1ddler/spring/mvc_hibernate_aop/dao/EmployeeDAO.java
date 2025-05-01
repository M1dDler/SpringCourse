package com.m1ddler.spring.mvc_hibernate_aop.dao;

import com.m1ddler.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployeeById(int empId);
    public void deleteEmployee(int empId);
}
