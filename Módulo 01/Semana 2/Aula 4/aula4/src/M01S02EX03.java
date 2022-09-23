public class M01S02EX03 {
    public static void main(String[] args) {
        int[] extrato = { 100, -35, -15, -5, 55, -20 };

        System.out.print("Elementos do array em ordem: ");
        for (int i=0; i<extrato.length;i++){
            System.out.printf("%d; ",extrato[i]);
        }
        System.out.println();


        System.out.print("Elementos do array em ordem decrescente: ");
        for (int i = extrato.length-1; i>=0; i--){
            System.out.printf("%d; ",extrato[i]);
        }
        System.out.println();


        int saldo=0;
        for (int i=0; i<extrato.length;i++) {
            saldo += extrato[i];
        }
        System.out.printf("Saldo atual: %d.",saldo);
        System.out.println();

        if (saldo >0){
            System.out.println("Saldo positivo!");
        } else {
            System.out.println("Saldo negativo!");
        }
    }
}
