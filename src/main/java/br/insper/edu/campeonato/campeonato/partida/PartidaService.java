package br.insper.edu.campeonato.campeonato.partida;

import br.insper.edu.campeonato.campeonato.campeonato.Campeonato;
import br.insper.edu.campeonato.campeonato.campeonato.CampeonatoService;
import br.insper.edu.campeonato.campeonato.time.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PartidaService {

    private ArrayList<Partida> partidas = new ArrayList<>();

    @Autowired
    TimeService timeService;

    @Autowired
    CampeonatoService campeonatoService;

    public Partida cadastrarPartida(Partida partida) {
        if (partida.getCampeonato().isBlank() || partida.getTimeVisitante().isBlank() || partida.getTimeMandante().isBlank()) {
            throw new RuntimeException("Time Visitante inexistente");
        }
        if (timeService.getTime(partida.getTimeVisitante()) == null) {
            throw new RuntimeException("Time Visitante inexistente");
        }
        if (timeService.getTime(partida.getTimeMandante()) == null) {
            throw new RuntimeException("Time Mandante inexistente");
        }
        if (campeonatoService.getCampeonato(partida.getCampeonato()) == null) {
            throw new RuntimeException("Campeonato inexistente");
        }

        this.partidas.add(partida);
        return partida;
    }

    public ArrayList<Partida> listarPartidasTime(String timeMandante) {
        ArrayList<Partida> partidasTime = new ArrayList<>();
        if (timeMandante != null) {
            for (Partida partida : partidas) {
                if (partida.getTimeMandante().equals(timeMandante)) {
                    partidasTime.add(partida);
                }
            }
            return partidasTime;
        }
        return partidas;
    }

    public ArrayList<Partida> listarPartidasCampeonato(String campeonato) {
        ArrayList<Partida> partidasCampeonato = new ArrayList<>();
        if (campeonato != null) {
            for (Partida partida : partidas) {
                if (partida.getCampeonato().equals(campeonato)) {
                    partidasCampeonato.add(partida);
                }
            }
            return partidasCampeonato;
        }
        return partidas;
    }

    public Integer getVitoriasTime(String identificador) {
        Integer vitorias = 0;
        for (Partida partida : partidas){
            if(partida.getTimeMandante().equals(identificador)) {
                if (partida.getPlacarMandante() > partida.getPlacarVisitante()){
                    vitorias+=1;
                }
            }
            else if(partida.getTimeVisitante().equals(identificador)) {
                if (partida.getPlacarMandante() < partida.getPlacarVisitante()){
                    vitorias+=1;
                }
            }
        }
        return vitorias;
    }
}
