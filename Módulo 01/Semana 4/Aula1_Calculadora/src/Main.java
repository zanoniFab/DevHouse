import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual operacao deseja fazer: 'a'dição, 's'ubtração, 'm'ultiplicação, 'd'ivisão ");
        String opcao = scanner.next();

        System.out.println("Informe dois numeros: ");
        System.out.println("Numero 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Numero 2: ");
        double num2 = scanner.nextDouble();

        Operacao operacao = obterOperacaoDesejada(opcao);
        double resultado = operacao.calcular(num1,num2);
        System.out.printf("O resultado é: %.2f.", resultado);
    }
        private static Operacao obterOperacaoDesejada(String opcao){
            Operacao operacao=null;
            double resultado;
            if (opcao.equals("a")) {
                    operacao = new Adicao();
            } else if (opcao == "s") {
                    operacao = new Subtracao();
            } else if (opcao == "m") {
                    operacao = new Multiplicacao();
            } else if (opcao == "d") {
                operacao = new Divisao();
            }
            return operacao;
        }
}

