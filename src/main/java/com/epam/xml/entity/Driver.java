package com.epam.xml.entity;

import java.util.HashSet;
import java.util.Set;

public class Driver {
    private Long id;
    private String name;
    private String surname;
    private int age;
    private Set busses = new HashSet<Bus>();

    public Driver()
    {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set getBusses() {
        return busses;
    }

    public void setBusses(Set busses) {
        this.busses = busses;
    }


}
