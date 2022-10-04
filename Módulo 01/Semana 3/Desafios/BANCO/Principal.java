//package M01S03PRATICAS.BANCO;
//
//import M01S03PRATICAS.BANCO.Cliente;
//import M01S03PRATICAS.BANCO.ContaBancaria;
//
//import java.time.LocalDateTime;
//import java.time.Month;
//import java.util.Scanner;
//
//public class Principal {
//    public static void main(String[] args) {
//        Cliente cliente = new Cliente("Cristiane",30,"Irmã mais velha");
//        ContaBancaria conta = new ContaBancaria("Bamerindus",123,987X,1000.0,cliente, LocalDateTime.of(2022, Month.JULY,30,10,0));
//        System.out.println(cliente.obterNomeEmMaiusculo());
//        System.out.println(cliente);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Digite o valor do saque:");
//        double valor = scanner.nextDouble();
//        conta.sacar(valor);
//        System.out.printf("Saque realizado! Salto atual = %.2f.", conta.getSaldo());
//    }
//}
