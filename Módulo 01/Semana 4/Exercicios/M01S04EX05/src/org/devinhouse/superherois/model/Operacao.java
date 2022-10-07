package org.devinhouse.superherois.model;

public enum Operacao {
    CADASTRAR_HEROI,
    CADASTRAR_VILAO,
    LISTAR,
    SAIR;
    public static Operacao obterPeloCodigo(int opcao){
        Operacao[] operacoes = Operacao.values();
        return operacoes[opcao-1];
    }
}
