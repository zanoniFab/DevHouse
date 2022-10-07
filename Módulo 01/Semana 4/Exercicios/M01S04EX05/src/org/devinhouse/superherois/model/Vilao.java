package org.devinhouse.superherois.model;

public class Vilao extends Personagem {
    private Integer tempoDePrisao;
public Vilao (String nome, String poder, Integer tempo){
    super(nome,poder);
    this.tempoDePrisao = tempo;
}

    @Override
    public String toString() {
        return "Vilão {"+ super.toString()+ "; Tempo de prisão: " + tempoDePrisao +" anos}";
    }

    public Integer getTempoDePrisao() {
        return tempoDePrisao;
    }

    public void setTempoDePrisao(Integer tempoDePrisao) {
        this.tempoDePrisao = tempoDePrisao;
    }
}

