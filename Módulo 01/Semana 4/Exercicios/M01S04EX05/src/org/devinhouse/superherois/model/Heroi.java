package org.devinhouse.superherois.model;

public class Heroi extends Personagem {
    private String nomeVidaReal;


    public Heroi(String nome, String poder, String nomeVidaReal) {
        super(nome, poder);
        this.nomeVidaReal = nomeVidaReal;
    }

    @Override
    public String toString() {
        return "Heroi {Nome na vida real: " + nomeVidaReal + "; " + super.toString()+"}";
    };

    public String getNomeVidaReal() {return nomeVidaReal;}
    public void setNomeVidaReal(String nomeVidaReal) {
        this.nomeVidaReal = nomeVidaReal;
    }
}

