import java.util.Arrays;
public class M01S02EX05 {
    public static void main(String[] args) {
        int[][] testes = {
                {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47},
                {1},
                {1, -1},
                null,
                {-2, -2, -2, -2},
                {20, 10, 30}
        };

        for (int i = 0; testes.length > i; i++) {
            int[] array=testes[i];
            if (array == null) {
                System.out.println("Nao é possível calcular.");
            } else {
                Arrays.sort(array);
                System.out.printf("Maior valor do array %d: %d.\n",i, array[array.length - 1]);
                System.out.printf("Menor valor do array %d: %d\n",i,array[0]);
            }
        }
    }
}