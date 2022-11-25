package tech.devinhouse.ex01s10api_copadomundo.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginRequest {

    @NotEmpty(message = "campo.obrigatorio")
    private String email;

    @NotEmpty(message = "campo.obrigatorio")
    private String senha;

}