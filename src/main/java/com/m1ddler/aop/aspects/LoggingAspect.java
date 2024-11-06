package com.m1ddler.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void get*())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: Trying to get a book.");
    }

    @Before("execution(public void com.m1ddler.aop.UniLibrary.returnBook())")
    public void beforeRetrurnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: Trying to return a book.");
    }
}
