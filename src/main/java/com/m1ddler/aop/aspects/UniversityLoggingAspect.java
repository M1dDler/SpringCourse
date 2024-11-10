package com.m1ddler.aop.aspects;

import com.m1ddler.aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsUniversityLoggingAdvice() {
//        System.out.println("beforeGetStudentsUniversityLoggingAdvice: Trying to get a list of students");
//    }
//
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsUniversityLoggingAdvice(JoinPoint joinPoint, List<Student> students) {
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        System.out.println("afterReturningGetStudentsUniversityLoggingAdvice signature: " + signature.getMethod());
//
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr" + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentsUniversityLoggingAdvice: The list of students was received successfully");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsUniversityLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsUniversityLoggingAdvice: We catch an exception in the getStudents method " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsUniversityLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("afterGetStudentsUniversityLoggingAdvice methodSignature: " + methodSignature.getName());
    }
}
