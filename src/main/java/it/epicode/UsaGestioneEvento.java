package it.epicode;

import it.epicode.dao.*;
import it.epicode.entities.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class UsaGestioneEvento {

    public static void main(String[] args) {
        EventoDAO eventoDao = new EventoDAO();
        LocationDao locationDao = new LocationDao();
        PersonaDao personaDao = new PersonaDao();
        PartecipazioneDao partecipazioneDao = new PartecipazioneDao();

//        Persona p1 = new Persona();
//        p1.setNome("Carlo");
//        p1.setCognome("Re");
//
//        Persona p2 = new Persona();
//        p2.setNome("Carlo");
//        p2.setCognome("Re");
//
//        personaDao.save(p1);
//        personaDao.save(p2);
//
//        Location location = new Location();
//        location.setCitta("Roma");
//
//        locationDao.save(location);
//
//        Evento ev1 = new Evento();
//        ev1.setDescrizione("concerto");
//        ev1.setLocation(location);
//
//        Evento ev2 = new Evento();
//        ev2.setDescrizione("corsa");
//        ev2.setLocation(location);
//
//        eventoDao.save(ev1);
//        eventoDao.save(ev2);
//
//        Partecipazione pa1 = new Partecipazione();
//        pa1.setPersona(p1);
//        pa1.setEvento(ev1);
//
//        Partecipazione pa2 = new Partecipazione();
//        pa2.setPersona(p1);
//        pa2.setEvento(ev2);
//
//        Partecipazione pa3 = new Partecipazione();
//        pa3.setPersona(p2);
//        pa3.setEvento(ev2);
//
//        partecipazioneDao.save(pa1);
//        partecipazioneDao.save(pa2);
//        partecipazioneDao.save(pa3);

        Persona p1 = personaDao.getById(1);
        System.out.println(p1);
        Persona p2 = personaDao.getById(102);
        System.out.println(p2);

//        Concerto concerto1 = new Concerto();
//        concerto1.setGenere(ETypeConcerto.POP);
//        concerto1.setStreaming(false);
//        Concerto concerto2 = new Concerto();
//        concerto2.setGenere(ETypeConcerto.POP);
//        concerto2.setStreaming(true);
//
//        eventoDao.save(concerto1);
//        eventoDao.save(concerto2);

        List<Concerto> concerti = eventoDao.getConcertoByGenere(ETypeConcerto.POP);
        concerti.forEach(concerto -> System.out.println(concerto));

        System.out.println("-----------------------------");
        List<Concerto> concerti2 = eventoDao.getConsertsByStreaming(false);
        concerti2.forEach(concerto -> System.out.println(concerto));

        PartitaDiCalcio partitaDiCalcio1 = new PartitaDiCalcio();
        partitaDiCalcio1.setGolCasa(3);
        partitaDiCalcio1.setGolOspite(4);
        partitaDiCalcio1.setSquadraDiCasa("A");
        partitaDiCalcio1.setSquadraOspite("B");
        partitaDiCalcio1.setVincitore("B");
        PartitaDiCalcio partitaDiCalcio2 = new PartitaDiCalcio();
        partitaDiCalcio2.setGolCasa(3);
        partitaDiCalcio2.setGolOspite(4);
        partitaDiCalcio2.setSquadraDiCasa("A");
        partitaDiCalcio2.setSquadraOspite("B");
        partitaDiCalcio2.setVincitore("B");
        PartitaDiCalcio partitaDiCalcio3 = new PartitaDiCalcio();
        partitaDiCalcio3.setGolCasa(4);
        partitaDiCalcio3.setGolOspite(3);
        partitaDiCalcio3.setSquadraDiCasa("A");
        partitaDiCalcio3.setSquadraOspite("B");
        partitaDiCalcio3.setVincitore("A");
        PartitaDiCalcio partitaDiCalcio4 = new PartitaDiCalcio();
        partitaDiCalcio4.setGolCasa(4);
        partitaDiCalcio4.setGolOspite(3);
        partitaDiCalcio4.setSquadraDiCasa("A");
        partitaDiCalcio4.setSquadraOspite("B");
        partitaDiCalcio4.setVincitore(null);
//
//        eventoDao.save(partitaDiCalcio1);
//        eventoDao.save(partitaDiCalcio2);
        //      eventoDao.save(partitaDiCalcio4);

        List<PartitaDiCalcio> vinteInCasa = eventoDao.getPartiteVinteInCasa();
        vinteInCasa.forEach(partitaDiCalcio -> System.out.println(partitaDiCalcio));

        List<PartitaDiCalcio> vinteFuoriCasa = eventoDao.getPartiteVinteFuoriCasa();
        vinteFuoriCasa.forEach(partitaDiCalcio -> System.out.println(partitaDiCalcio));

        List<PartitaDiCalcio> vintePareggiata = eventoDao.getPartitePareggiate();
        vintePareggiata.forEach(partitaDiCalcio -> System.out.println(partitaDiCalcio));




//        GaraDiAtletica g1 = new GaraDiAtletica();
//        p1.getGare().add(g1);
//        eventoDao.save(g1);
//
//        Persona persona = new Persona();
//        persona.setNome("Mario");
//        persona.setGare(Set.of(g1));
//        persona.setGareVinte(List.of(g1));
//        personaDao.save(persona);

//        GaraDiAtletica g1 = (GaraDiAtletica) eventoDao.getById(602);

//        g1.setVincitore(p1);
        GaraDiAtletica g2 = (GaraDiAtletica) eventoDao.getById(652);
//        g2.setAtleti(Set.of(p1,p2));
//        g2.setVincitore(p1);
//        eventoDao.save(g2);
        Persona p5 = personaDao.getById(152);
        System.out.println(p5);
        System.out.println(g2);


    }
}
