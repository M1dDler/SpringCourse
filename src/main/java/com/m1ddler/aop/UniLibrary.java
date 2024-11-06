package com.m1ddler.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook(){
        System.out.println("UniLibrary: We get a book");
    }

    public void returnBook(){
        System.out.println("UniLibrary: We return a book");
    }

    public void getMagazine(){
        System.out.println("UniLibrary: We get a magazine");
    }
}
