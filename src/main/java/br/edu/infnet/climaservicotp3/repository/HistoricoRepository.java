package br.edu.infnet.climaservicotp3.repository;

import br.edu.infnet.climaservicotp3.model.Historico;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoRepository extends ReactiveCrudRepository<Historico, Long> {
}
