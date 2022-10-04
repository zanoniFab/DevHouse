import java.util.Arrays;

public class Contador {
    public static void contarPalavras(String frase){
       frase.split(" ");
        String[] textoSeparado = frase.split(" ");
        System.out.println(Arrays.toString(textoSeparado));
        System.out.printf("Sua frase tem %d palavras.", textoSeparado.length);
    }
}
