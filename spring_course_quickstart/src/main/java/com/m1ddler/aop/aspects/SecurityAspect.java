package com.m1ddler.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {
    @Before("com.m1ddler.aop.aspects.MyPointCuts.allAddMethodsPointcut()")
    public void beforeAddSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: Trying to check the rights to receive the book");
    }
}
