package com.tanu.subclassmavenproject;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class Main {
    public static void main(String[] args) {
        Session ses = new Configuration().configure().buildSessionFactory().openSession();
        Employee e1 = new Developer(1, "X", 2500, 1200);
        Employee e2 = new Manager(2, "Y", 2600, 1300);
        Transaction tr = ses.beginTransaction();
        ses.persist(e1);
        ses.persist(e2);
        tr.commit();
        ses.close();
    }


    }
