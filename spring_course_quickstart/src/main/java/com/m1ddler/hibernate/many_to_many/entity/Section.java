package com.m1ddler.hibernate.many_to_many.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name= "child_section"
            ,joinColumns = @JoinColumn(name= "section_id")
            ,inverseJoinColumns = @JoinColumn(name= "child_id"))
    private List<Child> children;

    public List<Child> getChildren() {
        return children;
    }

    public Section() {}

    public Section(String name) {
        this.name = name;
    }

    public void addChildToSection(Child child) {
        if (children == null) {
            children = new ArrayList<Child>();
        }
        children.add(child);
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

    @Override
    public String toString() {
        return "Section [" +
                "id=" + id +
                ", name=" + name +
                "]";
    }
}