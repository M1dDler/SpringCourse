package com.m1ddler.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurName());
        System.out.println(person.getAge());

        Dog mydog = context.getBean("dogBean", Dog.class);
        mydog.setName("Bob");
        System.out.println(mydog.getName());

        context.close();
    }
}
