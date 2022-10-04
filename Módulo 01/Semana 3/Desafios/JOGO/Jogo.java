package M01S03PRATICAS.JOGO;

public class Jogo {
    private final int min;
    private final int max;
    private final int sorteado;

    public Jogo(int min, int max, int sorteado) {
        this.min = min;
        this.max = max;
        this.sorteado = sorteado;
    }

    public void imprimirSaudacao() {
        System.out.println("Ola!");
    }
}
