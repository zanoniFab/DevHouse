package com.devinhouse.desafios;

public class CalculadoraDeGorjetas {
    private Float valorDaConta;
    private Float percentualGorjeta;

    public Float calcularGorjeta(){
        return valorDaConta*(percentualGorjeta/100);
    }

    public Float getValorDaConta() {return valorDaConta;}
    public void setValorDaConta(Float valorDaConta) {this.valorDaConta = valorDaConta;}

    public Float getPercentualGorjeta() {
        return percentualGorjeta;
    }

    public void setPercentualGorjeta(Float percentualGorjeta) {
        this.percentualGorjeta = percentualGorjeta;
    }
}
