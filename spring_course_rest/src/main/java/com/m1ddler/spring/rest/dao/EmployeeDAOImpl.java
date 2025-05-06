package com.m1ddler.spring.rest.dao;

import com.m1ddler.spring.rest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private final SessionFactory sessionFactory;

    @Autowired
    public EmployeeDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(employee);
    }

    @Override
    public Employee getEmployeeById(int empId) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class, empId);
    }

    @Override
    public void deleteEmployee(int empId) {
        Session session = sessionFactory.getCurrentSession();
        session.remove(session.get(Employee.class, empId));
    }


}
