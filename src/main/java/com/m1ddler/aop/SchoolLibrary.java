package com.m1ddler.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook(){
        System.out.println("SchoolLibrary: We get a book.");
    }
}
