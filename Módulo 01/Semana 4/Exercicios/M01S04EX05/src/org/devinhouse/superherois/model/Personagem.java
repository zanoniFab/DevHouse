package org.devinhouse.superherois.model;

public abstract class Personagem {
    protected String nome;
    protected String Superpoder;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return Superpoder;
    }

    public void setSuperpoder(String superpoder) {
        Superpoder = superpoder;
    }
}


