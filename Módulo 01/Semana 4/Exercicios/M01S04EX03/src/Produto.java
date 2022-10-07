public class Produto implements Tributavel {
    double valor;
    double valorImposto;
    @Override
    public double calcularValorComImposto() {
        return valor+valorImposto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }
}
