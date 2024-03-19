package br.insper.edu.campeonato.campeonato.partida;

import br.insper.edu.campeonato.campeonato.campeonato.Campeonato;
import br.insper.edu.campeonato.campeonato.time.Time;

public class Partida {

    String timeMandante;
    String timeVisitante;

    Integer placarMandante;

    Integer placarVisitante;

    String campeonato;

    public Partida(String timeMandante, String timeVisitante, Integer placarMandante, Integer placarVisitante, String campeonato) {
        this.timeMandante = timeMandante;
        this.timeVisitante = timeVisitante;
        this.placarMandante = placarMandante;
        this.placarVisitante = placarVisitante;
        this.campeonato = campeonato;
    }

    public String getTimeMandante() {
        return this.timeMandante;
    }

    public void setTimeMandante(String timeMandante) {
        this.timeMandante = timeMandante;
    }

    public String getTimeVisitante() {
        return this.timeVisitante;
    }

    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public Integer getPlacarMandante() {
        return this.placarMandante;
    }

    public void setPlacarMandante(Integer placarMandante) {
        this.placarMandante = placarMandante;
    }

    public Integer getPlacarVisitante() {
        return this.placarVisitante;
    }

    public void setPlacarVisitante(Integer placarVisitante) {
        this.placarVisitante = placarVisitante;
    }

    public String getCampeonato() {
        return this.campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }
}
