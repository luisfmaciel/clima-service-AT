package br.edu.infnet.climaservicotp3.controller;

import br.edu.infnet.climaservicotp3.model.Historico;
import br.edu.infnet.climaservicotp3.service.HistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/historicos")
public class HistoricoController {

    @Autowired
    private HistoricoService historicoService;

    @GetMapping
    public Flux<Historico> obterHistoricos() {
        return historicoService.listar();
    }

    @PostMapping
    public Mono<Historico> salvarHistorico(@RequestBody Historico historico) {
        historico.setId(null);
        return historicoService.salvar(historico);
    }
}
