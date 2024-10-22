package com.m1ddler.spring;

public class Dog implements Pet{
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}
