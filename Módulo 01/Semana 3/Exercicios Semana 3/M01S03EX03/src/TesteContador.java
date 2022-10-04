import java.util.Scanner;

public class TesteContador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");

        String frase = scanner.nextLine();
        Contador.contarPalavras(frase);
    }
}
