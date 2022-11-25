package tech.devinhouse.ex01s10api_copadomundo.exception;

public class RegistroNaoEncontradoException extends RuntimeException {

    public RegistroNaoEncontradoException(String nomeRecurso, String idRecurso) {
        super(nomeRecurso + " com identificador " + idRecurso + " não encontrado!");
    }
    public RegistroNaoEncontradoException(String nomeRecurso, Integer id) {
        this(nomeRecurso, String.valueOf(id));
    }
}