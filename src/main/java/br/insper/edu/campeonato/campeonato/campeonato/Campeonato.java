package br.insper.edu.campeonato.campeonato.campeonato;

import br.insper.edu.campeonato.campeonato.partida.Partida;

import java.util.ArrayList;

public class Campeonato {

    private String identificador;

    private String nome;

    public String getIdentificador() {
        return this.identificador;
    }

    public String getNome() {
        return this.nome;
    }
    public Campeonato(String identificador, String nome) {
        this.identificador = identificador;
        this.nome = nome;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
