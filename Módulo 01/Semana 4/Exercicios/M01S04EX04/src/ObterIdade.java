import java.util.Scanner;

public class ObterIdade {
    public static void main(String[] args) throws IdadeException {
        chamarPerguntarIdade();
    }

    public static void chamarPerguntarIdade() throws IdadeException {
        try {
            while (!perguntarIdade()) {
                perguntarIdade();
            }
        } catch (IdadeException e) {
            System.out.println(e.getMessage());
            chamarPerguntarIdade();
        }
    }

    public static boolean perguntarIdade() throws IdadeException {
        System.out.print("Informe a sua idade: ");
        Scanner scanner = new Scanner(System.in);
        Integer idade = scanner.nextInt();

        if (idade < 0) {
            throw new IdadeException("Não é permitido idade negativa. Valor inválido: " + idade);
        } else if (idade == 0) {
            throw new IdadeException("Não é permitido idade zero.");
        } else if (idade > 100) {
            throw new IdadeException("Não é permitido idade superior a cem anos. Valor inválido: " + idade);
        } else {
            System.out.printf("Olá, você tem %d anos de idade!", idade);
            return true;
        }
    }
}
