package tech.devinhouse.m01s06ex1e2.models;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;

@Data
@Builder
public class Pet {
    private static int sequencia=0;
    private Integer id;
    private String nome;
    private String tipo;
    private String raca;
    private Integer idade;
    private String alimentoPreferido;
        public Pet(){
            this.id = generateId();
        }

    public Pet(Integer id, String nome, String tipo, String raca, Integer idade, String alimentoPreferido) {
        this.id = generateId();
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.alimentoPreferido = alimentoPreferido;
    }

    public Pet(Integer id, String nome, Integer idade) {
            this.id = generateId();
            this.nome = nome;
            this.idade = idade;
        }

        private Integer generateId(){
            return ++sequencia;
        }

}
