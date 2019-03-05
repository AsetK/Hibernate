package com.epam.annotation.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "busses")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_generator1")
    @SequenceGenerator(name = "my_generator1", sequenceName = "BUSSES_SEQ", allocationSize = 1)
    private Long id;
    @Column(name = "numb")
    private String number;
    private Long route_id;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "busDriver", joinColumns = {@JoinColumn(name = "bus_id")}, inverseJoinColumns = {@JoinColumn(name = "driver_id")})
    private Set<Driver> drivers = new HashSet<Driver>();


    public Bus()
    {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    public Long getRoute_id() {
        return route_id;
    }

    public void setRoute_id(Long route_id) {
        this.route_id = route_id;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", route_id=" + route_id +
                '}';
    }
}
