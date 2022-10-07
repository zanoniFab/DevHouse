package M01S03EX02;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Cristiane",1000f);
        String nome = funcionario.getNome();
        System.out.println("Salario inicial: "+funcionario.getSalario());
        funcionario.aumentar(100);
        System.out.println("Aumentou 100: "+funcionario.getSalario());
        funcionario.aumentar(100,50);
        System.out.println("Aumentou 100 com comissão 50: "+funcionario.getSalario());
    }
}
