package tech.devinhouse.ex01s10api_copadomundo.config;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import tech.devinhouse.ex01s10api_copadomundo.dto.ErroResponse;
import tech.devinhouse.ex01s10api_copadomundo.exception.RegistroExistenteException;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(RegistroExistenteException.class)
    public ResponseEntity<Object> handleRegistroExistenteException(RegistroExistenteException e) {
        ErroResponse erro = new ErroResponse(e.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
    }
    @Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        Map<String, String> camposComErros = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String nomeDoCampo = ((FieldError) error).getField();
            String msgDeErro = error.getDefaultMessage();
            camposComErros.put(nomeDoCampo, msgDeErro);
        });
        ErroResponse erro = new ErroResponse("Erro de validação", camposComErros);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
    }
}
