package com.utils;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

import com.models.User; // your entity class

public class SchemaGenerator {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();

        // Add all your annotated entity classes here
        cfg.addAnnotatedClass(User.class);

        // Build session factory just to trigger schema export
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        sessionFactory.close();
    }
}