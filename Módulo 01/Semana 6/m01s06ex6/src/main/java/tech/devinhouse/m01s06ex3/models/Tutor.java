package tech.devinhouse.m01s06ex3.models;

public class Tutor {
    private static int sequencia=0;
    private Integer id;
    private String nome;
    private Integer idade;

    public Tutor(){
        this.id = generateId();
    }

    public Tutor(Integer id, String nome, Integer idade) {
        this.id = generateId();
        this.nome = nome;
        this.idade = idade;
    }

    private Integer generateId(){
        return ++sequencia;
    }

}
