package it.epicode.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "evento")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String titolo;
    @Column(name = "data_evento")
    private LocalDate dataEvento;

    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoEvento tipo;

    @Column(name = "numero_massimo_partecipanti")
    private int numeroMassimoPartecipanti;

    @ManyToOne
    @JoinColumn(name = "location_fk")
    private Location location;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.REMOVE)
    private List<Partecipazione> partecipazioni;

    public Evento(){

    }

    public Evento(int id, String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipo, int numeroMassimoPartecipanti) {
        this.id = id;
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Partecipazione> getPartecipazioni() {
        return partecipazioni;
    }

    public void setPartecipazioni(List<Partecipazione> partecipazioni) {
        this.partecipazioni = partecipazioni;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipo=" + tipo +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                ", location=" + location +
                '}';
    }
}
