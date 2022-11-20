package tech.devinhouse.ex01s10api_copadomundo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.devinhouse.ex01s10api_copadomundo.exception.RegistroExistenteException;
import tech.devinhouse.ex01s10api_copadomundo.exception.RegistroNaoEncontradoException;
import tech.devinhouse.ex01s10api_copadomundo.model.Jogador;
import tech.devinhouse.ex01s10api_copadomundo.model.Selecao;
import tech.devinhouse.ex01s10api_copadomundo.repository.JogadorRepository;
import tech.devinhouse.ex01s10api_copadomundo.repository.SelecaoRepository;

@Service
@AllArgsConstructor
public class JogadorService {

    private JogadorRepository jogadorRepo;
    private SelecaoRepository selecaoRepo;


    public Jogador criar(String sigla, Jogador jogador) {
        Selecao selecao = selecaoRepo.findById(sigla)
                .orElseThrow(() -> new RegistroNaoEncontradoException(Selecao.class.getSimpleName(), sigla));
        final String nome = jogador.getNome();
        boolean existeComMesmoNomeNoMesmoTime = selecao.getJogadores().stream().anyMatch(p -> p.getNome().equals(nome));
        if (existeComMesmoNomeNoMesmoTime)
            throw new RegistroExistenteException(Jogador.class.getSimpleName(), nome);
        jogador.setSelecao(selecao);
        jogador = jogadorRepo.save(jogador);
        return jogador;
    }
}