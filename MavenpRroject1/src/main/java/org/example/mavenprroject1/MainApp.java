package org.example.mavenprroject1;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session ses = sf.openSession();

        Users user = new Users("ghjh","ghg");
        Transaction tx = ses.beginTransaction();
        ses.persist(user);
        tx.commit();
        ses.close();
    }
}
