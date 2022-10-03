package M01S03PRATICAS.JOGO;

import java.util.Random;

public class Sorteador {
    public int sortear (int min,int max){
        Random r = new Random();
        return (r.nextInt((max-min)+1+min));

    }
}
