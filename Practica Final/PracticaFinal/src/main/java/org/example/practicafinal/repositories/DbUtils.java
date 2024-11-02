package org.example.practicafinal.repositories;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbUtils {

    private static Session session;

    public static Session openSession() {
        if (session != null){
             return session;
        }
        SessionFactory sessionFactory =
                new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        if (session != null) {
            System.out.println("Session successfully opened!");
        } else {
            System.out.println("Error opening session!");
        }
        return (Session) session;
    }
}
