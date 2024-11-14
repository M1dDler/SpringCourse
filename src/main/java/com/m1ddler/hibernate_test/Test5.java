package com.m1ddler.hibernate_test;

import com.m1ddler.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory()) {
            Session session = factory.getCurrentSession();

//            session.beginTransaction();
//            Employee emp = new Employee("Micah", "Bell", "QA", 100);
//            session.persist(emp);
//            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 8);
//            session.remove(emp);
            session.createQuery("delete Employee where name = 'Micah'").executeUpdate();
            session.getTransaction().commit();
        }
    }
}
