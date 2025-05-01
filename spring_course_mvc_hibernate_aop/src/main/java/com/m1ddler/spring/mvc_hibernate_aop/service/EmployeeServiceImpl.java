package com.m1ddler.spring.mvc_hibernate_aop.service;

import com.m1ddler.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.m1ddler.spring.mvc_hibernate_aop.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int empId) {
        return employeeDAO.getEmployeeById(empId);
    }

    @Override
    @Transactional
    public void deleteEmployee(int empId) {
        employeeDAO.deleteEmployee(empId);
    }
}
