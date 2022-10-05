import org.devinhouse.superherois.model.Heroi;
import org.devinhouse.superherois.model.Personagem;
import org.devinhouse.superherois.model.Vilao;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do seu personagem: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o superpoder do seu personagem: ");
        String poder = scanner.nextLine();
        System.out.print("Seu personagem é um vilão ou um herói? ");
        String tipo = scanner.nextLine().toLowerCase();
        if (tipo.equals("vilao")) {
            System.out.print("Informe o tempo aprisionado (em anos): ");
            Integer tempo = scanner.nextInt();
            Vilao vilao = new Vilao(nome, poder, tempo);
            System.out.println(vilao.toString());
        } else if (tipo.equals("heroi")) {
            System.out.print("Informe o nome na vida real do seu personagem:");
            String nomeVidaReal = scanner.nextLine();
            Heroi heroi = new Heroi(nome, nomeVidaReal, poder);
            System.out.println(heroi.toString());
        } else {
            System.out.println("opção invalida");
        }

    }
}
