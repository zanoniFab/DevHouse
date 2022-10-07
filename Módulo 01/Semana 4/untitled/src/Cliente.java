import java.util.Scanner;

public class Cliente implements Autenticavel{

    @Override
    public boolean autenticar(String nome, String senha) {
        return nome.equals("cliente")&& senha.equals("admin");
    }
}
