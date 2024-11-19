package com.m1ddler.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Lord Of The Rings Trilogy")
    private String name;
    @Value("J.R.R. Tolkien")
    private String author;
    @Value("1949")
    private int yearPublished;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
