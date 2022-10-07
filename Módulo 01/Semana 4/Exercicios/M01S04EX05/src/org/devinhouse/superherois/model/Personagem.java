package org.devinhouse.superherois.model;

public abstract class Personagem {
    private String nome;
    private String Superpoder;

    public Personagem(String nome, String poder){
        this.nome = nome;
        this.Superpoder = poder;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +"; Superpoder: "+ Superpoder;
    }

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


