//      Desafio: Calcular o IMC
//      Método 1: com os valores já informados.

public class DesafioIMC {
    public static void main(String[] args) {

        float altura = 1.67f;
        float peso = 69f;
        float imc = peso/(altura*altura);

        System.out.println(String.format("O IMC calculado foi %.2f.", imc));

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

