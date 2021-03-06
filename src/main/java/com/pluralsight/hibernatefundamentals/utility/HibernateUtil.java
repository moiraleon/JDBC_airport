package com.pluralsight.hibernatefundamentals.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

    private static EntityManager entityManager;

    public static EntityManager getEntityManager(){
        if(entityManager == null) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m02.ex01");
            entityManager = emf.createEntityManager();
        }
        return entityManager;
    }


}