package com.pluralsight.hibernatefundamentals.impl;

import com.pluralsight.hibernatefundamentals.entity.Passenger;
import com.pluralsight.hibernatefundamentals.utility.HibernateUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class PassengerHibernateImpl {
    public void savePassenger(Passenger passenger){
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(passenger);
        em.getTransaction().commit();
    }
    public void deletePassenger(Passenger passenger){

    }
    public List<Passenger> getAllPassengers(){
        return null;
    }
    public void updatePassenger(Passenger passenger){

    }
}
