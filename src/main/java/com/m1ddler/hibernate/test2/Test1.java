package com.m1ddler.hibernate.test2;

import com.m1ddler.hibernate.test2.entity.Detail;
import com.m1ddler.hibernate.test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {

//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee emp = new Employee("Arthur", "Morgan", "IT", 950);
//            Detail detail = new Detail("Valentine", "132548478", "arthur.morgan@gmail.com");
//            emp.setEmpDetail(detail);
//            session.persist(emp);
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee emp = new Employee("John", "Marston", "sales", 820);
//            Detail detail = new Detail("Strawberry", "54848979", "john.marston@gmail.com");
//            emp.setEmpDetail(detail);
//            session.persist(emp);
//            session.getTransaction().commit();
//            System.out.println("Done!");

            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.remove(emp);
            session.getTransaction().commit();

        }
    }
}
