package com.devinhouse.desafios;

public class TesteGorjeta {
    public static void main(String[] args) {
        CalculadoraDeGorjetas calculadora = new CalculadoraDeGorjetas();
        calculadora.setValorDaConta(1600f);
        calculadora.setPercentualGorjeta(10f);
        System.out.println(calculadora.calcularGorjeta());
    }

}
