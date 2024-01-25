package it.epicode.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "partita_di_calcio")
public class PartitaDiCalcio extends Evento{

    @Column(name = "squadra_di_casa")
    private String squadraDiCasa;
    @Column(name = "squadra_ospite")
    private String squadraOspite;
    private String vincitore;
    @Column(name = "gol_casa")
    private int golCasa;
    @Column(name = "gol_ospite")
    private int golOspite;

    public PartitaDiCalcio(){}

    public PartitaDiCalcio(int id, String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipo,
                           int numeroMassimoPartecipanti, String squadraDiCasa, String squadraOspite, String vincitore, int golCasa,
                           int golOspite) {
        super(id, titolo, dataEvento, descrizione, tipo, numeroMassimoPartecipanti);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.golCasa = golCasa;
        this.golOspite = golOspite;
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", vincitore='" + vincitore + '\'' +
                ", golCasa=" + golCasa +
                ", golOspite=" + golOspite +
                '}';
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getVincitore() {
        return vincitore;
    }

    public void setVincitore(String vincitore) {
        this.vincitore = vincitore;
    }

    public int getGolCasa() {
        return golCasa;
    }

    public void setGolCasa(int golCasa) {
        this.golCasa = golCasa;
    }

    public int getGolOspite() {
        return golOspite;
    }

    public void setGolOspite(int golOspite) {
        this.golOspite = golOspite;
    }
}
