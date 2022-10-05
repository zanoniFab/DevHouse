package org.devinhouse.superherois.model;

public class Vilao extends Personagem {
    Integer tempoDePrisao;
public Vilao (String nome, String poder, Integer tempo){
    this.nome=nome;
    this.Superpoder=poder;
    this.tempoDePrisao=tempo;
}

    @Override
    public String toString() {
        return "Vilao{" +
                "tempoDePrisao=" + tempoDePrisao +
                ", nome='" + nome + '\'' +
                ", Superpoder='" + Superpoder + '\'' +
                '}';
    }
}

