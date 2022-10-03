public class Contador2 {
    private String frase;
    public Contador2(String frase){
        this.frase = frase;
    }
    public String contarPalavras(){
        String[] textoSeparado = frase.split(" ");
        return String.format("Sua frase tem %d palavras.",textoSeparado.length);
    }
}