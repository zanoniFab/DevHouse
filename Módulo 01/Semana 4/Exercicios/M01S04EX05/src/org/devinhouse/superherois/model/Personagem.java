package org.devinhouse.superherois.model;

public abstract class Personagem implements Comparable<Personagem>{
    private String nome;
    private String Superpoder;

    public Personagem(String nome, String poder){
        this.nome = nome;
        this.Superpoder = poder;
    }

    @Override
    public int compareTo(Personagem o) {
        return this.getNome().compareTo(o.getNome());
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null || getClass()!= obj.getClass()) return false;
        Personagem that = (Personagem) obj;
        return nome.equals(that.nome);
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


