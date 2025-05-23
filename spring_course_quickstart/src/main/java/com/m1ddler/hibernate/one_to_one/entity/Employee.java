package com.m1ddler.hibernate.one_to_one.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="department")
    private String department;
    @Column(name="salary")
    private int salary;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="details_id")
    private Detail empDetail;

    public Employee() {
    }

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    public void setEmpDetail(Detail empDetail){
        this.empDetail = empDetail;
    }

    public Detail getEmpDetail(){
        return empDetail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                ", surname=" + surname +
                ", department=" + department +
                ", salary= " + salary +
                "}";
    }
}
