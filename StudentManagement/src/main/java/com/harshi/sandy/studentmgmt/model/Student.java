package com.harshi.sandy.studentmgmt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    Integer id;

    String name;

    String yearOfPassing;

    Integer age;

    public Student() {
    }

    public Student(Integer id, String name, String yearOfPassing, Integer age) {
        this.id = id;
        this.name = name;
        this.yearOfPassing = yearOfPassing;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(String yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
