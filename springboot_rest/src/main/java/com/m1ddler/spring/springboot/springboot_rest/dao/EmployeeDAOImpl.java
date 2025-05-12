package com.m1ddler.spring.springboot.springboot_rest.dao;

import com.m1ddler.spring.springboot.springboot_rest.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private final EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return entityManager.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    public Employee getEmployeeById(int empId) {
        return entityManager.find(Employee.class, empId);
    }

    @Override
    public void deleteEmployee(int empId) {
        entityManager.remove(entityManager.find(Employee.class, empId));
    }
}
