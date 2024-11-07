package com.m1ddler.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(* get* ())")
    public void allGetMethodsPointcut() {}
}
