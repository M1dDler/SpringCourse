package com.m1ddler.hibernate.one_to_many_uni;

import com.m1ddler.hibernate.one_to_many_uni.entity.Department;
import com.m1ddler.hibernate.one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory()) {

            Session session = sessionFactory.openSession();
//            Department department = new Department("HR", 500, 1500);
//            Employee employee1 = new Employee("Arthur", "Morgan", 950);
//            Employee employee2 = new Employee("Sadie", "Adler", 700);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            session.beginTransaction();
//            session.persist(department);
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Department department = session.get(Department.class, 3);
//            System.out.println(department);
//            System.out.println(department.getEmployees());
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Department department = session.get(Department.class, 3);
            session.remove(department);
            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
