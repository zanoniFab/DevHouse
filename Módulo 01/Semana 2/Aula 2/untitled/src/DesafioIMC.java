import java.util.Scanner;

public class DesafioIMC {
    public static void main(String[] args) {
//        Calcular o IMC

//        float altura = 1.67f;
//        float peso = 69f;
//        float imc = peso/(altura*altura);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu peso: ");
        float peso = scanner.nextFloat();

        System.out.print("Informe sua altura: ");
        float altura = scanner.nextFloat();
        
        float imc = peso/(altura*altura);
        if (imc < 18.5) {
                    System.out.println("Seu IMC indica MAGREZA!");
                } else if (imc >=18.5 && imc <24.9) {
                    System.out.println("Seu IMC está NORMAL.");
                } else if (imc >= 25 && imc < 29.9) {
                    System.out.println("Seu IMC indica SOBREPESO!");
                } else if (imc >= 30 && imc < 39.9) {
                    System.out.println("Seu IMC indica OBESIDADE!");
                } else {
                    System.out.println("Seu IMC indica OBESIDADE GRAVE!");
                }
    }
}

