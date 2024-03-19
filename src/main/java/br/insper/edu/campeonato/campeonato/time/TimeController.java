package br.insper.edu.campeonato.campeonato.time;

import br.insper.edu.campeonato.campeonato.partida.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TimeController {

    @Autowired
    TimeService timeService;
    @Autowired
    PartidaService partidaService;

    @GetMapping("/time")
    public ArrayList<Time> getTimes(@RequestParam(required = false) String estado) {
        return timeService.listarTimes(estado);
    }

    @GetMapping("/time/{identificador}")
    public Time getTime(@PathVariable String identificador) {
        return timeService.getTime(identificador);
    }

    @PostMapping("/time")
    public Time salvartime(@RequestBody Time time) {
         return timeService.cadastrarTime(time);
    }

    @GetMapping("/time/vitorias/{identificador}")
    public Integer getVitoriasTime(@PathVariable String identificador) {
        return partidaService.getVitoriasTime(identificador);
    }
}
