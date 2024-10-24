package com.m1ddler.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dogBean", Dog.class);
        Dog yourDog = context.getBean("dogBean", Dog.class);

        System.out.println("Are the objects the same? Answer is " + (myDog==yourDog));
        System.out.println(myDog.getName() + " dog's memory address is " + myDog);
        System.out.println(yourDog.getName() + " dog's memory address is " + yourDog);

        context.close();
    }
}
