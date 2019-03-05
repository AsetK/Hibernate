package com.epam.xml.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static
    {
        try
        {
            sessionFactory = new Configuration().configure().buildSessionFactory(); //searches hibernate.cfg.xml in classpath(resources)
        }
        catch (Throwable exc)
        {
            System.err.print("Initial SessionFactory creation failed." + exc);
            throw new ExceptionInInitializerError(exc);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
