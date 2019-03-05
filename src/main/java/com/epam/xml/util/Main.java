package com.epam.xml.util;

import com.epam.xml.entity.Bus;
import com.epam.xml.entity.Driver;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws SQLException {
//        Bus bus = new Bus();
//        bus.setNumber("second");
//        bus.setRoute_id(1L);
        Bus bus = Factory.getInstance().getBusDAO().getBusById(1L);
        System.out.println(bus.getRoute_id());

        Set<Driver> drivers = bus.getDrivers();
        Iterator<Driver> iterator = drivers.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }



    }
}
