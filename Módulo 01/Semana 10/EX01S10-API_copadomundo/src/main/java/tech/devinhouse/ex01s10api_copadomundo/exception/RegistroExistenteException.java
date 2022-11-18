package tech.devinhouse.ex01s10api_copadomundo.exception;

public class RegistroExistenteException extends RuntimeException {

    public RegistroExistenteException(String nomeRecurso, String idRecurso) {
        super(nomeRecurso + " com identificador " + idRecurso + " já existente!");
    }

}