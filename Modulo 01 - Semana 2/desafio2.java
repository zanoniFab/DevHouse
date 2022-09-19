public class desafio2 {
    public static void main(String[] args) {
        String[][] multicores = {
                {"vermelho", "preto", "branco"},
                {"roxo", "azul"}
        };
        System.out.println("Primeiro elemento do primeiro array interno: " + multicores[0][0]);
        System.out.println("Primeiro Elemento do segundo array interno: "+ multicores[1][0]);
        System.out.println("Tamanho array multidimensional: "+ multicores.length);
        System.out.println("Tamanho primeiro array: "+ multicores[0].length);
    }
}
