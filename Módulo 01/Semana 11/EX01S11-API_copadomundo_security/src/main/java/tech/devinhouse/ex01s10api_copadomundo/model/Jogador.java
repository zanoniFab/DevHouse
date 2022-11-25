package tech.devinhouse.ex01s10api_copadomundo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "JOGADORES")
@Data
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_JOGADOR")
    private Integer id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Posicao posicao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sigla", referencedColumnName = "sigla")
    private Selecao selecao;

}