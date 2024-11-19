package com.m1ddler.hibernate.many_to_many;

import com.m1ddler.hibernate.many_to_many.entity.Child;
import com.m1ddler.hibernate.many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory()) {

            Session session = sessionFactory.openSession();

//            Section section = new Section("Dance");
//            Child child = new Child("Sadie", 12);
//            Child child2 = new Child("John", 5);
//            Child child3 = new Child("Pavel", 9);
//            section.addChildToSection(child);
//            section.addChildToSection(child2);
//            section.addChildToSection(child3);
//            session.beginTransaction();
//            session.persist(section);
//            session.getTransaction().commit();
//            sessionFactory.close();
//            System.out.println("Done!");

//            session = sessionFactory.getCurrentSession();
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child = new Child("Igor", 8);
//            child.addSectionToChild(section1);
//            child.addSectionToChild(section2);
//            child.addSectionToChild(section3);
//            session.beginTransaction();
//            session.persist(child);
//            session.getTransaction().commit();
//            sessionFactory.close();
//            System.out.println("Done!");

//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Child child = session.get(Child.class, 6);
//            System.out.println(child);
//            System.out.println(child.getSections());
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Section section = session.get(Section.class, 6);
//            session.remove(section);
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Child child = session.get(Child.class, 1);
            session.remove(child);
            session.getTransaction().commit();
            System.out.println("Done!");


        }

    }
}
