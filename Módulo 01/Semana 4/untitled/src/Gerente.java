import java.util.Scanner;

public class Gerente extends Funcionario implements Autenticavel{

    @Override
    public boolean autenticar(String nome, String senha) {
        return false;
    }

    @Override
    public String obterCategoria() {
        return null;
    }
}
