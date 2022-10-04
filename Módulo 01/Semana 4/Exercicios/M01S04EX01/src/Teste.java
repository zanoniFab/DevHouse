public class Teste {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        System.out.println(contaCorrente.printarSaldo());

        contaCorrente.depositar(200);
        System.out.println(contaCorrente.printarSaldo());

        contaCorrente.sacar(100);
        System.out.println(contaCorrente.printarSaldo());
    }
}
