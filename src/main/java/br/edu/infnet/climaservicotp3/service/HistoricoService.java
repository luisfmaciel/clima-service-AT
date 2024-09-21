package br.edu.infnet.climaservicotp3.service;

import br.edu.infnet.climaservicotp3.model.Historico;
import br.edu.infnet.climaservicotp3.repository.HistoricoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HistoricoService {

    @Autowired
    private HistoricoRepository historicoRepository;

    public Flux<Historico> listar() {
        return historicoRepository.findAll();
    }

    public Mono<Historico> salvar(Historico historico) {
        return historicoRepository.save(historico);
    }
}
