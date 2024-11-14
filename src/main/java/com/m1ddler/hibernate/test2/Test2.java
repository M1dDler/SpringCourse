package com.m1ddler.hibernate.test2;

import com.m1ddler.aop.Student;
import com.m1ddler.hibernate.test2.entity.Detail;
import com.m1ddler.hibernate.test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();

            session.beginTransaction();
            Detail detail = session.get(Detail.class, 2);
            detail.getEmployee().setEmpDetail(null);
            session.remove(detail);
            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
