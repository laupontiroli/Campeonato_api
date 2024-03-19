package br.insper.edu.campeonato.campeonato.time;

import br.insper.edu.campeonato.campeonato.partida.Partida;
import br.insper.edu.campeonato.campeonato.partida.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TimeService {

    private ArrayList<Time> times = new ArrayList<>();


    public Time cadastrarTime(Time time) {
        if(time.getNome().equals("") || time.getEstadio().equals("")|| time.getEstado().equals("")|| time.getIdentificador().equals("")){
            throw new RuntimeException("Campos obrigatórios faltando");
        }
        else{
            times.add(time);
            return time;
        }
    }

    public ArrayList<Time> listarTimes(String estado) {
        if (estado != null){
            ArrayList<Time> lista = new ArrayList<>();
            for (Time time : times) {
                if (time.getEstado().startsWith(estado)) {
                    lista.add(time);
                }
            }
            return lista;
        }
        return times;
        }
    public Time getTime(String identificador) {
        for (Time time : times){
            if( time.getIdentificador().equals(identificador)){
                return time;
            }
        }
        throw new RuntimeException("Time nao encontrado");
    }


}



