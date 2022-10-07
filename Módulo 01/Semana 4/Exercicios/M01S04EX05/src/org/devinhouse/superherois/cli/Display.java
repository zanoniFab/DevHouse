package org.devinhouse.superherois.cli;

import org.devinhouse.superherois.model.Heroi;
import org.devinhouse.superherois.model.Operacao;
import org.devinhouse.superherois.model.Personagem;
import org.devinhouse.superherois.model.Vilao;

import java.util.List;
import java.util.Scanner;

public class Display {
    public void exibirMenu(){
        System.out.print("Escolha uma opção:\n1- Cadastrar Herói\n2- Cadastrar Vilão\n3- Listar\n4- Sair\nDigite a opção desejada: ");
    }
    public Operacao obterOperacao() {
        System.out.print("Digite a opção desejada: ");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        Operacao operacao = Operacao.obterPeloCodigo(opcao);
        return operacao;
    }
    public Personagem cadastrar(int operacao){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do seu personagem: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o superpoder do seu personagem: ");
        String poder = scanner.nextLine();
        Personagem personagem = null;
        if (operacao == 0){
            System.out.println("Informe o nome na vida real do seu Herói: ");
            String nomeVidaReal = scanner.nextLine();
            personagem = new Heroi(nome,poder,nomeVidaReal);
        } else if (operacao == 1){
            System.out.println("Informe o tempo de prisão em anos do seu Vilão: ");
            int tempoDePrisao = scanner.nextInt();
            personagem = new Vilao(nome,poder,tempoDePrisao);
        }
        return personagem;
    }
    public void listar(List<Personagem> personagens){
        for (Personagem personagem:personagens){
            System.out.println(personagem);
        }
    }

}
