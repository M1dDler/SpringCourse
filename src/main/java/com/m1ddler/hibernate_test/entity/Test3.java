package com.m1ddler.hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            String query = "from Employee where salary>:salary";
            List<Employee> employees = session.createQuery(query, Employee.class)
                    .setParameter("salary", 500)
                    .getResultList();
            session.getTransaction().commit();
            for (Employee employee : employees) {
                System.out.println(employee);
            }
            System.out.println("Done!");
        }
    }
}
