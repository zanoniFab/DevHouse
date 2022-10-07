package org.devinhouse.superherois;

import org.devinhouse.superherois.cli.Display;
import org.devinhouse.superherois.exception.OpcaoInvalidaException;
import org.devinhouse.superherois.model.Operacao;
import org.devinhouse.superherois.model.Personagem;
import org.devinhouse.superherois.repo.PersonagemRepository;

import java.util.List;

public class Aplicacao {
    private Display display = new Display();
    private PersonagemRepository repository = new PersonagemRepository();
    public void executar() {
        Operacao operacao = null;
        while (operacao != Operacao.SAIR) {
            display.exibirMenu();
            try {
                operacao = display.obterOperacao();
                processar(operacao);
            } catch (OpcaoInvalidaException e) {
                display.exibirMensagem("Opção inválida!");
            }
        }
    }

    private void processar(Operacao operacao) {
        switch (operacao){
            case CADASTRAR_HEROI:
                Personagem heroi = display.cadastrar(0);
                repository.inserir(heroi);
                break;
            case CADASTRAR_VILAO:
                Personagem vilao = display.cadastrar(1);
                repository.inserir(vilao);
                break;
            case LISTAR:
                List<Personagem> personagens = repository.consultar();
                display.listar(personagens);
                break;
        }
    }
}