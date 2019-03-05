package com.epam.annotation.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_generator2")
    @SequenceGenerator(name = "my_generator2", sequenceName = "DRIVERS_SEQ", allocationSize = 1)
    private Long id;
    private String name;
    private String surname;
    private int age;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "busDriver", joinColumns = {@JoinColumn(name = "driver_id")}, inverseJoinColumns = {@JoinColumn(name = "bus_id")})
    private Set<Bus> busses = new HashSet<Bus>();

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

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
