package com.m1ddler.spring.mvc;

import com.m1ddler.spring.mvc.validation.CheckEmail;
import jakarta.validation.constraints.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(max = 10, min = 3, message = "The field must contain a minimum of 3 characters and a maximum of 10 characters.")
    private String name;
    @NotBlank(message = "The field cannot be empty.")
    private String surname;
    @Min(value = 7000, message = "Minimum value 7000")
    @Max(value = 50000, message = "Maximum value 50000")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageList;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "Please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value = "abc.com", message = "Email must ends with abc.com")
    private String email;

    public Employee(){
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("Ford", "Ford");
        carBrands.put("Audi", "Audi");
        carBrands.put("BMW", "BMW");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Ukrainian", "UK");
        languageList.put("Polska", "PL");
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "name=" + name +
                ", surname=" + surname +
                ", salary=" + salary +
                ", department=" + department +
                "]";
    }
}
