import java.util.Scanner;

public class Diretor extends Funcionario implements Autenticavel{

    @Override
    public boolean autenticar(String nome, String senha) {
        return false;
    }

    @Override
    public String obterCategoria() {
        return null;
    }
}
