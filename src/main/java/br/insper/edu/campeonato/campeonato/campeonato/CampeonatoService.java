package br.insper.edu.campeonato.campeonato.campeonato;

import br.insper.edu.campeonato.campeonato.time.Time;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CampeonatoService {

    private ArrayList<Campeonato> campeonatos = new ArrayList<>();

    public Campeonato cadastrarCampeonato(Campeonato campeonato){
        if (campeonato.getIdentificador().equals("") || campeonato.getNome().equals("")){
            throw new RuntimeException("Campos obrigatórios faltando");
        }
        campeonatos.add(campeonato);
        return campeonato;
    }

    public Campeonato getCampeonato(String identificador) {
        for (Campeonato campeonato : campeonatos){
            if( campeonato.getIdentificador().equals(identificador)){
                return campeonato;
            }
        }
        throw new RuntimeException("Time nao encontrado");
    }


}
