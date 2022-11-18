package tech.devinhouse.ex01s10api_copadomundo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "selecoes")
public class Selecao {
    @Id
    private String sigla;

    private String nome;

    private String grupo;

    private LocalDateTime dataCadastro;

    @OneToMany
    private List<Jogador> jogadores;
}
