package tech.devinhouse.ex01s10api_copadomundo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.ex01s10api_copadomundo.model.Selecao;

@Repository
public interface SelecaoRepository extends JpaRepository<Selecao, String> {

}
