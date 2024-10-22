package com.m1ddler.spring;

public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
