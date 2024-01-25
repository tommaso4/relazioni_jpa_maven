package it.epicode.dao;

import it.epicode.entities.Concerto;
import it.epicode.entities.ETypeConcerto;
import it.epicode.entities.Evento;

import it.epicode.entities.PartitaDiCalcio;
import jakarta.persistence.*;

import java.util.List;


public class EventoDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public EventoDAO() {
        emf = Persistence.createEntityManagerFactory("gestioneeventi");
        em = emf.createEntityManager();
    }

    public void save(Evento e) {
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(e);

        et.commit();
    }

    public Evento getById(int id) {
        return em.find(Evento.class, id);
    }

    public void delete(Evento e) {
        Evento ev = getById(e.getId());

        EntityTransaction et = em.getTransaction();
        et.begin();

        em.remove(ev);

        et.commit();
    }

    public List<Concerto> getConcertoByGenere(ETypeConcerto genere) {

        try {
            TypedQuery<Concerto> query = em.createQuery("select c from Concerto c where c.genere= : genere", Concerto.class);
            query.setParameter("genere", genere);

            return query.getResultList();
        }catch (NoResultException e){
            return null;
        }
    }

    public List<Concerto> getConsertsByStreaming(Boolean bool){
        try {
            TypedQuery<Concerto> query = em.createQuery("select c from Concerto c where c.streaming = : bool", Concerto.class);
            query.setParameter("bool",bool);
            return query.getResultList();
        }catch (NoResultException e){
            return  null;
        }
    }
    public List<PartitaDiCalcio> getPartiteVinteInCasa (){
        try {
            TypedQuery<PartitaDiCalcio> query = em.createQuery("select p from PartitaDiCalcio p where p.squadraDiCasa = p.vincitore", PartitaDiCalcio.class);
            return query.getResultList();
        }catch (NoResultException e){
            return null;
        }
    }
    public List<PartitaDiCalcio> getPartiteVinteFuoriCasa (){
        try {
            TypedQuery<PartitaDiCalcio> query = em.createQuery("select p from PartitaDiCalcio p where p.squadraOspite = p.vincitore", PartitaDiCalcio.class);
            return query.getResultList();
        }catch (NoResultException e){
            return null;
        }
    }
    public List<PartitaDiCalcio> getPartitePareggiate (){
        try {
            TypedQuery<PartitaDiCalcio> query = em.createQuery("select p from PartitaDiCalcio p where p.vincitore IS null", PartitaDiCalcio.class);
            return query.getResultList();
        }catch (NoResultException e){
            return null;
        }
    }
}
