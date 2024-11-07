package com.m1ddler.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Lord Of The Rings Trilogy")
    private String name;

    public String getName() {
        return name;
    }
}
