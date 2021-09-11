package com.pluralsight.hibernatefundamentals.impl;

import com.pluralsight.hibernatefundamentals.entity.Ticket;
import com.pluralsight.hibernatefundamentals.utility.HibernateUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class TicketHibernateImpl {
    public void saveTicket(Ticket ticket){
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(ticket);
        em.getTransaction().commit();
    }

    public void deleteTicket(Ticket ticket){

    }

    public List<Ticket> getAllTickets(){
        return null;
    }

    public void updateTicket(Ticket ticket){

    }
}
