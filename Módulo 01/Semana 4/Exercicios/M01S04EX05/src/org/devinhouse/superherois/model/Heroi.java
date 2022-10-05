package org.devinhouse.superherois.model;

public class Heroi extends Personagem {
    String nomeVidaReal;

public Heroi (String nome, String nomeVidaReal, String poder){
    this.nome = nome;
    this.nomeVidaReal = nomeVidaReal;
    this.Superpoder = poder;
}

    @Override
    public String toString() {
        return "Heroi{" +
                "nomeVidaReal='" + nomeVidaReal + '\'' +
                ", nome='" + nome + '\'' +
                ", Superpoder='" + Superpoder + '\'' +
                '}';
    }
}
