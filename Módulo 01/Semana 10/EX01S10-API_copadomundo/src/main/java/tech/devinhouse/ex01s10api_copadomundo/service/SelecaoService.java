package tech.devinhouse.ex01s10api_copadomundo.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import tech.devinhouse.ex01s10api_copadomundo.exception.RegistroExistenteException;
import tech.devinhouse.ex01s10api_copadomundo.model.Selecao;
import tech.devinhouse.ex01s10api_copadomundo.repository.SelecaoRepository;

import java.time.LocalDateTime;
import java.util.List;

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

    public List<Selecao> consultar(String direcao,Integer tamanho,Integer pagina,String ordenacao) {
        Sort.Direction direcaoSort = Sort.Direction.valueOf(direcao);
        PageRequest pageable = PageRequest.of(pagina, tamanho).withSort(direcaoSort, ordenacao);
        Page<Selecao> page = repo.findAll(pageable);
        return page.toList();
    }
}

