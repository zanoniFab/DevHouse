public class M01S02Ex02 {
    public static void main(String[] args) {

        double[][] notas = {
                {10, 8.5, 5.5, 9.5},
                {8.5, 7, 7.5, 6},
                {8, 9, 10, 7.5},
                {9, 9.5, 10, 8}
        };

        double somaNotas = notas[0][0]+notas[1][0]+notas[2][0]+notas[3][0];

        System.out.println(String.format("Nota do primeiro elemento do terceiro array de notas: %.1f.",notas[2][0]));
        System.out.println(String.format("Nota do segundo elemento do quarto array de notas: %.1f.",notas[3][1]));
        System.out.println(String.format("Soma das quatro primeiras notas de cada array: %.1f.", somaNotas));

// outra forma de imprimir:
//        System.out.println("Nota do primeiro elemento do terceiro array de notas "+notas[2][0]);
//        System.out.println("Nota do segundo elemento do quarto array de notas "+notas[3][1]);
//        System.out.println("Soma das quatro primeiras notas de cada array: " +somaNotas);
    }
}
