import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do seu personagem: ");
        String nome = scanner.nextLine();
        System.out.print("Escolha a opção que define seu personagem: \n1) Vilão;\n2) Herói;\n");
        Integer opcao = scanner.nextInt();
        Personagem personagem = new Personagem(nome);
        if (opcao == 1) {
            personagem.setTipo(Tipo.VILAO);
        } else if (opcao == 2) {
            personagem.setTipo(Tipo.HEROI);
        }
        System.out.println(personagem.toString());
    }
}
