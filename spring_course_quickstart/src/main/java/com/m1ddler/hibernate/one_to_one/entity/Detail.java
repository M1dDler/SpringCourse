package com.m1ddler.hibernate.one_to_one.entity;

import jakarta.persistence.*;

@Entity
@Table(name="details")
public class Detail {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="city")
    private String city;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="email")
    private String email;
    @OneToOne(mappedBy = "empDetail", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Employee employee;

    public Detail() {}

    public Detail(String city, String phone_number, String email) {
        this.city = city;
        this.phoneNumber = phone_number;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Detail [" +
                "id=" + id +
                ", city=" + city +
                ", phoneNumber=" + phoneNumber +
                ", email=" + email +
                "]";
    }
}
