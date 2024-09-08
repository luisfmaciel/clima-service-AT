package br.edu.infnet.climaservicotp3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class WebClientConfig {

    @Bean
    public WebClient webClient(WebClient.Builder builder) {
        return builder.baseUrl("http://apiadvisor.climatempo.com.br/api/v1/anl/synoptic").build();
    }
}