package com.epam.annotation.dao;

import com.epam.annotation.entity.Bus;
import com.epam.annotation.entity.Driver;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class DriverDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public void addDriver(Driver driver)
    {
        sessionFactory.getCurrentSession().save(driver);
    }
}
