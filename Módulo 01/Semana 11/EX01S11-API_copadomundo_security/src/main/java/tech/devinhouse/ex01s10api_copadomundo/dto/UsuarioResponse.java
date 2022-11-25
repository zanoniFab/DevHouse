package tech.devinhouse.ex01s10api_copadomundo.dto;

import lombok.Data;
import tech.devinhouse.ex01s10api_copadomundo.model.Papel;

import java.time.LocalDate;
import java.util.List;

@Data
public class UsuarioResponse {

    private Integer id;

    private String email;

    private LocalDate dataNascimento;

    private List<Papel> papeis;

}