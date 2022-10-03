import java.util.Arrays;
import java.util.List;
class exer{
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");

        System.out.print("Imprimindo com o for classico: ");
        for (int i=0;i<nomes.size();i++){
            System.out.printf("%s; ",nomes.get(i));
        }
        System.out.println();
        System.out.print("Imprimindo com o for-each: ");
        for (String nome:nomes){
            System.out.printf("%s; ",nome);
        }


        System.out.println();
        System.out.print("Imprimindo com o while: ");
        int k=0;
        while (k<nomes.size()){
            System.out.printf("%s; ",nomes.get(k));
            k++;
        }

    }
}
