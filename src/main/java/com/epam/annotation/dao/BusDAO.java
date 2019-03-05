package com.epam.annotation.dao;

import com.epam.annotation.entity.Bus;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Repository
public class BusDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public void addBuss(Bus bus)
    {
        sessionFactory.getCurrentSession().save(bus);
    }

    @Transactional
    public Bus getBus(Long busId)
    {
        return sessionFactory.getCurrentSession().get(Bus.class, busId);
    }

    @Transactional
    public List<Bus> getAllBusses()
    {
        return sessionFactory.getCurrentSession().createCriteria(Bus.class).list();
    }

    @Transactional
    public void deleteBus(Long busId)
    {
        Query query = sessionFactory.getCurrentSession().createQuery("delete Bus where id =: id");
        query.setParameter("id", busId);
        query.executeUpdate();
    }
}
