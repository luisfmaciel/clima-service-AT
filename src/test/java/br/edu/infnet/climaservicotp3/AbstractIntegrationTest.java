package br.edu.infnet.climaservicotp3;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@ExtendWith(SpringExtension.class)
@SpringBootTest
public abstract class AbstractIntegrationTest {

    @Container
    public static GenericContainer<?> h2Container = new GenericContainer<>("mockserver/mockserver:latest")
            .withExposedPorts(1521)
            .withEnv("H2_OPTIONS", "-ifNotExists");

    static {
        h2Container.start();
        System.setProperty("DB_URL", "r2dbc:h2:mem:///climadb");
        System.setProperty("DB_USERNAME", "sa");
        System.setProperty("DB_PASSWORD", "");
    }
}