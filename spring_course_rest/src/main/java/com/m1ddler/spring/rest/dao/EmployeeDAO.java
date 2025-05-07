package com.m1ddler.spring.rest.dao;

import com.m1ddler.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public Employee saveEmployee(Employee employee);
    public Employee getEmployeeById(int empId);
    public void deleteEmployee(int empId);
}
