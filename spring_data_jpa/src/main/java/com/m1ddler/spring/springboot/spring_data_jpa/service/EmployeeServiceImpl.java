package com.m1ddler.spring.springboot.spring_data_jpa.service;

import com.m1ddler.spring.springboot.spring_data_jpa.dao.EmployeeRepository;

import com.m1ddler.spring.springboot.spring_data_jpa.entity.Employee;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int empId) {
        return employeeRepository.findById(empId)
                .orElseThrow(() -> new EntityNotFoundException("Employee with ID " + empId + " not found"));
    }

    @Override
    @Transactional
    public void deleteEmployee(int empId) {
        employeeRepository.deleteById(empId);
    }

    @Override
    public List<Employee> getEmployeesByName(String name) {
        return employeeRepository.findAllByName(name);
    }
}
