package it.epicode.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "concerto")
public class Concerto extends Evento{

    @Enumerated(EnumType.STRING)
    private ETypeConcerto genere;
    private Boolean streaming;
    public Concerto(){}
    public Concerto(int id, String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipo, int numeroMassimoPartecipanti,
                    ETypeConcerto genere, Boolean streaming) {
        super(id, titolo, dataEvento, descrizione, tipo, numeroMassimoPartecipanti);
        this.genere = genere;
        this.streaming = streaming;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", streaming=" + streaming +
                '}';
    }

    public ETypeConcerto getGenere() {
        return genere;
    }

    public void setGenere(ETypeConcerto genere) {
        this.genere = genere;
    }

    public Boolean getStreaming() {
        return streaming;
    }

    public void setStreaming(Boolean streaming) {
        this.streaming = streaming;
    }
}
