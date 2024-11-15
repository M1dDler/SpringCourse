package com.m1ddler.hibernate.test;

import com.m1ddler.hibernate.test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(1000);

            session.createQuery("update Employee set salary=2000").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
