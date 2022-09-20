import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        /* Forma 1 de fazer:
        List <Integer> opcoes = List.of(1,2,3,4);
        System.out.println("1- Primeira Opção");
        System.out.println("2- Segunda Opção");
        System.out.println("3- Terceira Opção");
        System.out.println("4- Quarta Opção");
        System.out.println("Digite a opção desejada. ");


        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        System.out.println("A opção escolhida está na lista de opções? " +opcoes.contains(opcao));

         */

        // Forma 2 de fazer:
        List<String> opcoes = Arrays.asList("1- Primeira Opção","2- Segunda Opção","3- Terceira Opção","4- Quarta Opção");

        System.out.println(opcoes.get(0));
        System.out.println(opcoes.get(1));
        System.out.println(opcoes.get(2));
        System.out.println(opcoes.get(3));

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        System.out.println("A opção escolhida está na lista de opções? " +opcoes.contains(opcao));
        }
}
