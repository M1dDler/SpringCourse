package com.m1ddler.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("personBean")
@Scope("prototype")
public class Person {

    private Pet pet;
    @Value("${person.surname}")
    private String SurName;
    @Value("${person.age}")
    private int age;

//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean is created");
    }

    @Autowired
    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("Class Person set pet");
        this.pet = pet;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        System.out.println("Class Person: set surName");
        this.SurName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    @PostConstruct
    public void init(){
        System.out.println("Person class: Init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Person class: Destroy method");
    }
}
