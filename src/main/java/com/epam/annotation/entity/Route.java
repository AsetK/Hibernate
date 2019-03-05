package com.epam.annotation.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "routes")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_generator3")
    @SequenceGenerator(name = "my_generator3", sequenceName = "ROUTES_SEQ", allocationSize = 1)
    private Long id;
    private String name;
    @Column(name = "numb")
    private int number;
    @OneToMany(mappedBy = "route_id", fetch = FetchType.EAGER)
    private Set<Bus> busses = new HashSet<Bus>();

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
