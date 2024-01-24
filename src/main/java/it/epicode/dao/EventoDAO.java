package it.epicode.dao;

import it.epicode.entities.Evento;

import jakarta.persistence.*;


public class EventoDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public EventoDAO(){
        emf = Persistence.createEntityManagerFactory("gestioneeventi");
        em = emf.createEntityManager();
    }

    public void save(Evento e){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(e);

        et.commit();
    }

    public Evento getById(int id){
        return em.find(Evento.class, id);
    }

    public void delete(Evento e){
        Evento ev = getById(e.getId());

        EntityTransaction et = em.getTransaction();
        et.begin();

        em.remove(ev);

        et.commit();
    }
}
