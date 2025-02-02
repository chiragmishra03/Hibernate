package org.hibernate;

import org.hibernate.cfg.Configuration;

import static org.hibernate.createobject.CreateObject.createAddress;
import static org.hibernate.createobject.CreateObject.createStudent;

public class Main {

    private static SessionFactory sessionFactory;

    // Initialize Hibernate Configuration
    public static void initSessionFactory() {
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }


    public static void main(String[] args) {
        // Initialize SessionFactory
        initSessionFactory();

        // Create Student and Address
        Student student = createStudent();
        Address address = createAddress();


        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            session.persist(student);
            session.persist(address);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }


    }
}
