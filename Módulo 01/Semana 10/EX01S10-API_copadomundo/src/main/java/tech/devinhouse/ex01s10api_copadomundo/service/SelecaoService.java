package tech.devinhouse.ex01s10api_copadomundo.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import tech.devinhouse.ex01s10api_copadomundo.exception.RegistroExistenteException;
import tech.devinhouse.ex01s10api_copadomundo.exception.RegistroNaoEncontradoException;
import tech.devinhouse.ex01s10api_copadomundo.model.Selecao;
import tech.devinhouse.ex01s10api_copadomundo.repository.SelecaoRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
    public Selecao consultar(String sigla) {
        Optional<Selecao> perfilOpt = repo.findById(sigla);
        if (perfilOpt.isPresent())
            return perfilOpt.get();
        throw new RegistroNaoEncontradoException("Selecao", sigla);
    }

    public Selecao atualizar(Selecao selecao) {
            final String sigla = selecao.getSigla();
            Selecao selecaoBD = repo.findById(sigla)
                    .orElseThrow(() -> new RegistroNaoEncontradoException(Selecao.class.getSimpleName(), sigla));
            selecaoBD.setGrupo(selecao.getGrupo());
            selecaoBD.setNome(selecao.getNome());
            selecao = repo.save(selecaoBD);
            return selecao;
    }
    public void excluir(String sigla) {
        if (!repo.existsById(sigla))
            throw new RegistroNaoEncontradoException(Selecao.class.getSimpleName(), sigla);
        repo.deleteById(sigla);
    }
}

