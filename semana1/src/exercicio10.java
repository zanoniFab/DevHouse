import java.time.LocalDate;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        System.out.println("Em que ano você nasceu? ");
        Scanner scanner = new Scanner(System.in);
        int anoInformado = scanner.nextInt();
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        System.out.println("Sua idade é " + (anoAtual-anoInformado));

    }
}
