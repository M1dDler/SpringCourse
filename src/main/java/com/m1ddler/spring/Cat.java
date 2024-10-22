package com.m1ddler.spring;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
