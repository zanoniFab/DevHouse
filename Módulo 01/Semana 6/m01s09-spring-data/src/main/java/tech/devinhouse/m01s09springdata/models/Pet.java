package tech.devinhouse.m01s09springdata.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="pet")
public class Pet{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String tipo;
    private String raca;

//    @JsonIgnore
    @ManyToOne
    private Tutor tutor;
}
