package com.m1ddler.hibernate.many_to_many.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="children")
public class Child {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name= "child_section",
               joinColumns = @JoinColumn(name= "child_id")
            ,inverseJoinColumns = @JoinColumn(name = "section_id"))
    private List<Section> sections;

    public List<Section> getSections() {
        return sections;
    }

    public Child() {}

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addSectionToChild(Section section) {
        if (sections == null) {
            sections = new ArrayList<Section>();
        }
        sections.add(section);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Child [" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                "]";
    }
}
