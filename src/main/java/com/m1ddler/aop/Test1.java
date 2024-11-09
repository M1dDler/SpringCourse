package com.m1ddler.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Book book = context.getBean("book", Book.class);

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
//        library.getBook();
//        library.getMagazine();
        library.addBook("M1dDler",book);
        library.addMagazine();


        context.close();
    }
}
