package com.epam.xml.entity;




import java.util.HashSet;
import java.util.Set;

public class Bus {
    private Long id;
    private String number;
    private Set drivers = new HashSet<Driver>();
    private Long route_id;

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

    public void setDrivers(Set drivers) {
        this.drivers = drivers;
    }

    public Long getRoute_id() {
        return route_id;
    }

    public void setRoute_id(Long route_id) {
        this.route_id = route_id;
    }


}
