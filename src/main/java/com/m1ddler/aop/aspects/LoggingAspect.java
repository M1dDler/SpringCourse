package com.m1ddler.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {


//    @Pointcut("execution(public void com.m1ddler.aop.UniLibrary.*(..))")
//    private void allMethodsUniLibraryPointCut(){}
//
//    @Pointcut("execution(public void com.m1ddler.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineMethodUniLibraryPointCut(){}
//
//    @Pointcut("allMethodsUniLibraryPointCut() && !returnMagazineMethodUniLibraryPointCut()")
//    private void allMethodsUniLibraryWithoutReturnMagazinePointCut(){}
//
//    @Before("allMethodsUniLibraryWithoutReturnMagazinePointCut()")
//    public void beforeAllMethodsUniLibraryWithoutReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsUniLibraryWithoutReturnMagazineAdvice: Log message");
//    }



//    @Pointcut("execution(public void com.m1ddler.aop.UniLibrary.get* ())")
//    private void allGetMethodsUniLibraryPointcut() {}
//
//    @Pointcut("execution(public void com.m1ddler.aop.UniLibrary.return*())")
//    private void allReturnMethodsUniLibraryPointcut() {}
//
//    @Pointcut("allGetMethodsUniLibraryPointcut() || allReturnMethodsUniLibraryPointcut()")
//    private void allGetAndReturnMethodsUniLibraryPointcut() {}
//
//    @Before("allGetMethodsUniLibraryPointcut()")
//    public void beforeGetLoggingUniLibraryAdvice(){
//        System.out.println("beforeGetLoggingUniLibraryAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsUniLibraryPointcut()")
//    public void beforeReturnMethodsUniLibraryAdvice(){
//        System.out.println("beforeReturnMethodsUniLibraryAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsUniLibraryPointcut()")
//    public void beforeGetAndReturnMethodsUniLibraryAdvice(){
//        System.out.println("beforeGetAndReturnMethodsUniLibraryAdvice: writing Log #3");
//    }



    @Before("com.m1ddler.aop.aspects.MyPointCuts.allGetMethodsPointcut()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: Trying to get a book and magazine");
    }

}
