package tech.devinhouse.m01s06ex3.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pet {
    private Integer id;
    private String nome;
    private String tipo;
    private String raca;
    private Integer idade;
    private String alimentoPreferido;

}