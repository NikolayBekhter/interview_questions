package ru.geekbrains.lesson_5.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtils {
    private SessionFactory factory;

    public void init() {
        if (factory == null) {
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();
        }
    }

    public Session getSession() {
        return factory.getCurrentSession();
    }

    public void shutDown() {
        if (factory != null) {
            factory.close();
        }
    }
}
