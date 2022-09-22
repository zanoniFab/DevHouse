import java.util.ArrayList;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        int[] arr={3,5,1,4,7,6,5,2,3,4,2,3,1,0,6};

        List<Integer> unicos=new ArrayList<>();

        for (int i=0; arr.length > i; i++){
            boolean repetido = false;
            int nro=arr[i];

            for (int j = 0; arr.length > j; j++) {
                if (j == i) { // se mesmo indice, quer dizer que eh o mesmo nro, entao pode pular
                    continue;
                }
                if (nro == arr[j]) {
                    repetido = true;
                }
            }
            if (!repetido){
                    unicos.add(nro);
                }
            }
            System.out.println(unicos);
        }
    }
