package br.edu.infnet.climaservicotp3;

import br.edu.infnet.climaservicotp3.model.Clima;
import br.edu.infnet.climaservicotp3.service.ClimaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.junit.jupiter.Testcontainers;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.List;

@SpringBootTest
@ActiveProfiles("test")
@Testcontainers
public class ClimaControllerTest extends AbstractIntegrationTest{

    @Autowired
    private ClimaService climaService;

    @Test
    public void testBuscarClima() {
        Mono<List<Clima>> result = climaService.buscarClima("BR", "a93fd2b16c134c7bd1ce0aecc8168ac0");

        StepVerifier.create(result)
                .expectNextMatches(climas -> !climas.isEmpty())
                .verifyComplete();
    }
}