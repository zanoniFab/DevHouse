public class Teste {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setValor(100);
        produto.setValorImposto(10);
        System.out.println(produto.calcularValorComImposto());

    }
}
