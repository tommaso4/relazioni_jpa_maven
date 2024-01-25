package it.epicode.entities;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "gara_di_atletica")
public class GaraDiAtletica extends Evento {

    @ManyToMany(mappedBy = "gare")
    private Set<Persona> atleti;
    @ManyToOne
    @JoinColumn(name = "vincitore_id")
    private Persona vincitore;

    public GaraDiAtletica(){    }

    public GaraDiAtletica(int id, String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipo, int numeroMassimoPartecipanti,
                          Persona vincitore, Set<Persona> atleti) {
        super(id, titolo, dataEvento, descrizione, tipo, numeroMassimoPartecipanti);
        this.vincitore = vincitore;
        this.atleti = atleti;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "atleti=" + atleti +
                ", vincitore=" + vincitore +
                '}';
    }

    public Set<Persona> getAtleti() {
        return atleti;
    }

    public void setAtleti(Set<Persona> atleti) {
        this.atleti = atleti;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }
}