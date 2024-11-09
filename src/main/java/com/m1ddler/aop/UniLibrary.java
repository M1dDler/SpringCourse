package com.m1ddler.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("UniLibrary: We get a book");

    }

    public void returnBook(){
        System.out.println("UniLibrary: We return a book");
    }

    public void getMagazine(){
        System.out.println("UniLibrary: We get a magazine");
    }

    public void returnMagazine(){
        System.out.println("UniLibrary: We return a magazine");
    }

    public void addBook(String personName, Book book){
        System.out.println("UniLibrary: We add a book");
    }

    public void addMagazine(){
        System.out.println("UniLibrary: We add a magazine");
    }
}
