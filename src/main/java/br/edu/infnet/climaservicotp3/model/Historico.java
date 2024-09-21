package br.edu.infnet.climaservicotp3.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "historicos")
public class Historico {
    @Id
    private Long id;
    private String country;
    private String date;
    private String text;
}
