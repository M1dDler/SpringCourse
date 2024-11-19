package com.m1ddler.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Chip");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Dale");

        System.out.println("Are the objects the same? Answer is " + (myDog==yourDog));
        System.out.println(myDog.getName() + " dog's memory address is " + myDog);
        System.out.println(yourDog.getName() + " dog's memory address is " + yourDog);

        context.close();

    }
}
