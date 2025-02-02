package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


        Student student = new Student();
        student.setName("demo user");
        student.setSAge(18);
        student.setRollNo(1);


        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(org.example.Student.class);

        SessionFactory sf = cfg.buildSessionFactory();




        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(student);


        tx.commit();
        session.close();

    }
}