package tech.devinhouse.ex01s10api_copadomundo.exception;

public class RegistroExistenteException extends RuntimeException {

    public RegistroExistenteException(String nomeRecurso, String id) {
        super(nomeRecurso + " com identificador " + id + " já existente!");
    }

}