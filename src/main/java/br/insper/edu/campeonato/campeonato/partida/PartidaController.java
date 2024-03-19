package br.insper.edu.campeonato.campeonato.partida;

import br.insper.edu.campeonato.campeonato.time.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PartidaController {

    @Autowired
    PartidaService partidaService;
    @GetMapping("/partida")
    public ArrayList<Partida> getPartidas(@RequestParam(required = false) String campeonato,@RequestParam(required = false) String time) {
        if (time != null){
            return partidaService.listarPartidasTime(time);
        }
        return partidaService.listarPartidasCampeonato(campeonato);
    }

    @PostMapping("/partida")
    public Partida cadastrarPartida(@RequestBody Partida partida) {
        return partidaService.cadastrarPartida(partida);
    }
}
