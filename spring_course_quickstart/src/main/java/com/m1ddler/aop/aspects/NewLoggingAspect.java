package com.m1ddler.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(* returnBook())")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aroundBeforeReturnBookAdvice: Trying returning Book in library");
        Object targetMethodResult = null;
        try {
            targetMethodResult = pjp.proceed();
        }
        catch (Exception e) {
            System.out.println("aroundReturnBookAdvice Exception detected:" + e);
            throw e;
        }
        System.out.println("aroundAfterBookAdvice: The book has been returned");
        return targetMethodResult;
    }
}
