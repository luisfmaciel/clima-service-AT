package br.edu.infnet.climaservicotp3.service;

import br.edu.infnet.climaservicotp3.model.Clima;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ClimaService {

    @Autowired
    private WebClient webClient;

    public Mono<List<Clima>> buscarClima(String pais, String token) {
        return webClient.get()
                .uri("/locale/{pais}?token={token}", pais, token)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Clima>>() {});
    }
}