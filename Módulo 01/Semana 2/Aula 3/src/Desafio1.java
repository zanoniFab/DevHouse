public class Desafio1 {
    public static void main(String[] args) {
        double valorInicial = 1200;
        int anos = 0;
        while (valorInicial<5000) {
            anos++;
            double perc = valorInicial * 0.10;
            valorInicial += perc;
        }
        System.out.println(String.format("Em %f anos Jack tera R$5mil.",anos));
    }

}
