import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        System.out.println("Qual é seu herói favorito? ");
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();
        System.out.println("Seu herói favorito é " + resposta);

    }
}
