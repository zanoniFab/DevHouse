package tech.devinhouse.ex01s10api_copadomundo.dto;

import lombok.Data;
import tech.devinhouse.ex01s10api_copadomundo.model.Papel;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;
import java.util.List;

@Data
public class UsuarioRequest {

    @NotEmpty(message = "campo.obrigatorio")
    @Email(message = "campo.invalido") //validar o email
    private String email;

    @NotEmpty(message = "campo.obrigatorio")
    private String senha;

    @NotNull(message = "campo.obrigatorio")
    @Past(message = "campo.invalido") //validar que a data é do passado
    private LocalDate dataNascimento;

    @NotEmpty(message = "campo.obrigatorio")
    private List<Papel> papeis;

}
