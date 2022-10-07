import java.util.Scanner;

public class TesteContador2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        Contador2 contador2 = new Contador2(frase);
        System.out.println(contador2.contarPalavras());
    }
}