package com.m1ddler.aop.aspects;

import com.m1ddler.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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



    @Before("com.m1ddler.aop.aspects.MyPointCuts.allAddMethodsPointcut()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature: "+methodSignature);
        System.out.println("methodSignature getMethod: "+methodSignature.getMethod());
        System.out.println("methodSignature getReturnType: "+methodSignature.getReturnType());
        System.out.println("methodSignature getName: "+methodSignature.getName());
        System.out.println("beforeGetLoggingAdvice: Trying to get a book and magazine");

        if (methodSignature.getName().equals("addBook")){
            Object[] args = joinPoint.getArgs();
            for(Object arg : args){
                if (arg instanceof Book){
                    Book mybook = (Book)arg;
                    System.out.println("Information about book: Name - "+mybook.getName()+". Author - "+mybook.getAuthor()+". " +
                            "Year published - "+mybook.getYearPublished());
                }
                else if (arg instanceof String){
                    System.out.println("Book in library add: "+arg);
                }
            }
        }
    }

}
