package com.epam.xml.dao;

import com.epam.xml.entity.Bus;
import com.epam.xml.util.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BusDAOImpl implements BusDAO{

    public void addBus(Bus bus) throws SQLException {
        Session session = null;
        try
        {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(bus);
            session.getTransaction().commit();
        }
        catch (Exception exc)
        {

        }
        finally
        {
            if(session!=null && session.isOpen())
                session.close();
        }
    }


    public void updateBus(Long bus_id, Bus bus) throws SQLException {
        Session session = null;
        try
        {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(bus);
            session.getTransaction().commit();
        }
        catch (Exception exc)
        {

        }
        finally
        {
            if(session!=null && session.isOpen())
                session.close();
        }
    }


    public Bus getBusById(Long bus_id) throws SQLException {
        Session session = null;
        Bus bus = null;
        try
        {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            bus = session.get(Bus.class, bus_id);
            session.getTransaction().commit();
        }
        catch (Exception exc)
        {

        }
        finally
        {
            if(session!=null && session.isOpen())
                session.close();
        }
        return bus;
    }


    public Collection getAllBusses() throws SQLException {
        Session session = null;
        List busses = new ArrayList<Bus>();
        try
        {
            session = HibernateUtil.getSessionFactory().openSession();
            busses = session.createCriteria(Bus.class).list();
        }
        catch (Exception exc)
        {

        }
        finally
        {
            if(session!=null && session.isOpen())
                session.close();
        }
        return busses;
    }
}
