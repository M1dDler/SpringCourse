package com.m1ddler.spring.mvc_hibernate_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {
    @Around("execution(* com.m1ddler.spring.mvc_hibernate_aop.service.EmployeeServiceImpl.* (..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        String methodName = methodSignature.getName();
        System.out.println("aroundAllRepositoryMethodsAdvice: Begin of " + methodName);
        Object targetMethodResult = null;
        try {
            targetMethodResult = pjp.proceed();
        }
        catch (Exception e) {
            System.out.println("aroundAllRepositoryMethodsAdvice Exception detected:" + e);
            throw e;
        }
        System.out.println("aroundAllRepositoryMethodsAdvice: End of " + methodName);
        return targetMethodResult;
    }
}
