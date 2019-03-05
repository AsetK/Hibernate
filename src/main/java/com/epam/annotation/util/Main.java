package com.epam.annotation.util;

import com.epam.annotation.dao.BusDAO;
import com.epam.annotation.dao.DriverDAO;
import com.epam.annotation.entity.Bus;
import com.epam.annotation.entity.Driver;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

public class Main {

    public static void main(String[] args)  {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println(Arrays.asList(context.getBeanDefinitionNames()));

        BusDAO busDAO = context.getBean(BusDAO.class);
        DriverDAO driverDAO = context.getBean(DriverDAO.class);

        System.out.println(busDAO.getAllBusses());
        System.out.println(busDAO.getBus(1L));
        System.out.println(busDAO.getBus(1L).getDrivers());


        Driver driver = new Driver();
        driver.setAge(29);
        driver.setName("X");
        driver.setSurname("X");
//        driverDAO.addDriver(driver);


        Bus bus = new Bus();
        bus.setRoute_id(22L);
        bus.setNumber("11");
        bus.getDrivers().add(driver);

        busDAO.addBuss(bus);

    }
}
