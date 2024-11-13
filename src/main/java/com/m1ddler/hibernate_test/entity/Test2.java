package com.m1ddler.hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Simon", "Pearson", "sales", 400);
            session.beginTransaction();
            session.persist(emp);
            int myId = emp.getId();
            Employee emp2 = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(emp2);
        }
    }
}
