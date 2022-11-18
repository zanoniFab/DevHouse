package tech.devinhouse.ex01s10api_copadomundo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.devinhouse.ex01s10api_copadomundo.exception.RegistroExistenteException;
import tech.devinhouse.ex01s10api_copadomundo.model.Selecao;
import tech.devinhouse.ex01s10api_copadomundo.repository.SelecaoRepository;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class SelecaoService {
    private SelecaoRepository repo;

    public Selecao inserir(Selecao selecao) {
        boolean existe = repo.existsById(selecao.getNome());
        if (existe)
            throw new RegistroExistenteException("Selecao", selecao.getNome());
        selecao.setDataCadastro(LocalDateTime.now());
        repo.save(selecao);
        return selecao;
    }
}
