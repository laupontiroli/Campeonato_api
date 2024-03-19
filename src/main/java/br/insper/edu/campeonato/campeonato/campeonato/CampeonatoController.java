package br.insper.edu.campeonato.campeonato.campeonato;

import br.insper.edu.campeonato.campeonato.time.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CampeonatoController {
    @Autowired
    CampeonatoService campeonatoService;
    @PostMapping("/campeonato")
    public Campeonato salvarCampeonato(@RequestBody Campeonato campeonato) {
        return campeonatoService.cadastrarCampeonato(campeonato);
    }
}
