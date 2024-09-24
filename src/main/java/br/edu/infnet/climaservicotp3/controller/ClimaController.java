package br.edu.infnet.climaservicotp3.controller;

import br.edu.infnet.climaservicotp3.model.Clima;
import br.edu.infnet.climaservicotp3.service.ClimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/clima")
public class ClimaController {

    @Autowired
    private ClimaService climaService;

    @GetMapping("/pais/{pais}")
    public Mono<List<Clima>> getClimas(@PathVariable String pais, @RequestParam String token) {
        // teste ci/cd
        return climaService.buscarClima(pais, token);
    }
}
