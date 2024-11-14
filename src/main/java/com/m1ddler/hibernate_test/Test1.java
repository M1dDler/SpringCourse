package com.m1ddler.hibernate_test;

import com.m1ddler.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Dutch", "Van Der Linde", "HR", 1500);
            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();
        }
    }
}
