package tech.devinhouse.ex01s10api_copadomundo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="USUARIOSCOPA")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_USUARIO")
    private Integer id;
    private String email;
    private String senha;
    private LocalDate dataNascimento;
    @ElementCollection(targetClass = Papel.class)
    @JoinTable(name = "USUARIOSCOPA_ROLES", joinColumns = @JoinColumn(name = "ID_USUARIO"))
    @Column(name = "ROLE", nullable = false)
    @Enumerated(EnumType.STRING)
    private List<Papel> papeis;

}
