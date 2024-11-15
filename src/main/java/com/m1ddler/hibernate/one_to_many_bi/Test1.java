package com.m1ddler.hibernate.one_to_many_bi;

import com.m1ddler.hibernate.one_to_many_bi.entity.Department;
import com.m1ddler.hibernate.one_to_many_bi.entity.Employee;
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
//            Department department = new Department("Sales", 800, 1500);
//            Employee emp1 = new Employee("Arthur", "Morgan", 800);
//            Employee emp2 = new Employee("John", "Marston", 1500);
//            Employee emp3 = new Employee("Sadie", "Adler", 1200);
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department.addEmployeeToDepartment(emp3);
//            session.beginTransaction();
//            session.persist(department);
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            System.out.println("Get Department");
            Department department = session.get(Department.class, 4);
            System.out.println("Show Department");
            System.out.println(department);
            System.out.println("Show Employees of the Department");
            System.out.println(department.getEmployees());
            session.getTransaction().commit();
            System.out.println("Done!");

//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee.getDepartment());
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 3);
//            session.remove(employee);
//            session.getTransaction().commit();
//            System.out.println("Done!");
        }
    }
}
