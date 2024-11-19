package com.m1ddler.aop;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("M1dDler",4,7.5);
        Student st2 = new Student("Sage",1,4);
        Student st3 = new Student("Clove",5,8.2);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    //The Return of this method is changed in AfterReturning in UniversityLoggingAspect class
    public List<Student> getStudents() {
        System.out.println("Start getStudents method");
//        System.out.println(students.get(3));
        System.out.println("getStudents: " + students);
        return students;
    }
}
