package br.insper.edu.campeonato.campeonato.time;

import javax.swing.*;

public class Time {

    private String identificador;
    private String estado;
    private String nome;
    private String estadio;

    public Time(String identificador, String estado, String nome, String estadio) {
        this.identificador = identificador;
        this.estado = estado;
        this.nome = nome;
        this.estadio = estadio;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getEstado() {
        return estado;
    }

    public String getNome() {
        return nome;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
}
