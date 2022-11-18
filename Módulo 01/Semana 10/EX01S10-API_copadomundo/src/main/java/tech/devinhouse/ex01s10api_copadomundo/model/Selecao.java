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
    @Column(length = 3)
    String sigla;
    @Column(nullable = false,length = 30)
    String nome;
    @Column(nullable = false,length = 1)
    String grupo;
    LocalDateTime dataCadastro;

    @OneToMany
    List<Jogador> jogadores;
}
