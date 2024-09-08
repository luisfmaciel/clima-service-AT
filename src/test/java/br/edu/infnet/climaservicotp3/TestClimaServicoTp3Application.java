package br.edu.infnet.climaservicotp3;

import org.springframework.boot.SpringApplication;

public class TestClimaServicoTp3Application {

    public static void main(String[] args) {
        SpringApplication.from(ClimaServicoTp3Application::main).with(TestcontainersConfiguration.class).run(args);
    }

}
