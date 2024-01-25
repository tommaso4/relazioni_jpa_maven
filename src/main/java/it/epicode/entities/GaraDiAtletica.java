//package it.epicode.entities;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
//import java.time.LocalDate;
//import java.util.List;
//@Entity
//@Table(name = "gara_di_atletica")
//public class GaraDiAtletica extends Evento {
//
//    private List<Persona> atleti;
//    private Persona vincitore;
//
//    public GaraDiAtletica(){    }
//
//    public GaraDiAtletica(int id, String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipo, int numeroMassimoPartecipanti,
//                          Persona vincitore, List<Persona> atleti) {
//        super(id, titolo, dataEvento, descrizione, tipo, numeroMassimoPartecipanti);
//        this.vincitore = vincitore;
//        this.atleti = atleti;
//    }
//
//    public List<Persona> getAtleti() {
//        return atleti;
//    }
//
//    public void setAtleti(List<Persona> atleti) {
//        this.atleti = atleti;
//    }
//
//    public Persona getVincitore() {
//        return vincitore;
//    }
//
//    public void setVincitore(Persona vincitore) {
//        this.vincitore = vincitore;
//    }
//}