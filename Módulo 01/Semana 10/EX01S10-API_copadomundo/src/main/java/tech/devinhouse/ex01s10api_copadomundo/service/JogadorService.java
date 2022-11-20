package tech.devinhouse.ex01s10api_copadomundo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.devinhouse.ex01s10api_copadomundo.exception.RegistroExistenteException;
import tech.devinhouse.ex01s10api_copadomundo.exception.RegistroNaoEncontradoException;
import tech.devinhouse.ex01s10api_copadomundo.model.Jogador;
import tech.devinhouse.ex01s10api_copadomundo.model.Selecao;
import tech.devinhouse.ex01s10api_copadomundo.repository.JogadorRepository;
import tech.devinhouse.ex01s10api_copadomundo.repository.SelecaoRepository;

import java.util.ArrayList;
import java.util.List;

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

    public List<Jogador> consultar(String sigla, String nomePesquisa) {
        Selecao selecao = selecaoRepo.findById(sigla)
                .orElseThrow(() -> new RegistroNaoEncontradoException(Selecao.class.getSimpleName(), sigla));
//        return selecao.getJogadores();
        List<Jogador> jogadores = selecao.getJogadores();
//        if (pesquisa != null) {
//            jogadores = jogadores.stream().filter(j -> j.getNome().contains(pesquisa)).collect(Collectors.toList());
//        }
        if (nomePesquisa == null)
            return jogadores;
        List<Jogador> filtrados = new ArrayList<>();
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().contains(nomePesquisa)) {
                filtrados.add(jogador);
            }
        }
        return filtrados;
    }
}