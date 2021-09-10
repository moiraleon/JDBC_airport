package com.pluralsight.hibernatefundamentals.impl;

import com.pluralsight.hibernatefundamentals.entity.Airport;
import com.pluralsight.hibernatefundamentals.utility.HibernateUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class AirportHibernateImpl {
    public void saveAirport(Airport airport){
        EntityManager em =  HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(airport);
        em.getTransaction().commit();
    }

    public void deleteAirport(Airport airport){

    }

    public List<Airport> getAllAirports(){
        return null;
    }

    public void updateAirport(Airport airport){

    }


}
