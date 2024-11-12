package com.m1ddler.hibernate_test.entity;

import com.m1ddler.aop.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Arthur", "Morgan", "IT", 500);
            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();
        }
    }
}
