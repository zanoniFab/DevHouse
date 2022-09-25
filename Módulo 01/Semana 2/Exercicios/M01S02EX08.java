import java.util.Arrays;
import java.util.List;
class M01S02EX08{
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);
        for(int i=0;i<numeros.size();i++){
            if (numeros.get(i)>50){
                System.out.print(numeros.get(i));
                break;
            }
        }
    }
}