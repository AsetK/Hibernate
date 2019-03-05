package com.epam.xml.entity;

import java.util.HashSet;
import java.util.Set;

public class Route {
    private Long id;
    private String name;
    private int number;
    private Set busses = new HashSet<Bus>();

    public Route()
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Set getBusses() {
        return busses;
    }

    public void setBusses(Set busses) {
        this.busses = busses;
    }
}
