public abstract class Conta {
    double saldo;
    protected double obterSaldoAtual(){
        return this.saldo;
    }
    public String printarSaldo(){
        return String.format("Seu saldo atual é: %.2f.",this.saldo);
    }
}
