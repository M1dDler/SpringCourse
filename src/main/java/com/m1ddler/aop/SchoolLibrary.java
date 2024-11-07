package com.m1ddler.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    public void getBook(Book book, int idBook) {
        System.out.println("SchoolLibrary: We get a book "+book.getName()+"with id "+idBook);
    }
}
