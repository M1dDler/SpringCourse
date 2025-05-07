package com.m1ddler.spring.rest.entity;

public class Employee {
    private int empId;
    private String name;
    private String surname;
    private String department;
    private int salary;

    public Employee() {}

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id =" + empId +
                ", name ='" + name + '\'' +
                ", surname ='" + surname + '\'' +
                ", department ='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
