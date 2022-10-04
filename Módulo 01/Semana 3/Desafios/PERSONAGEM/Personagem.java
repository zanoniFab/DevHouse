package M01S03PRATICAS.PERSONAGEM;

import java.time.LocalDate;

public class Personagem {
    private String nome;
    private String referencia;
    private Integer idade;
    private LocalDate dataDeCadastramento;

    public String obterNomeEmMaiusculo(){return this.nome.toUpperCase();}
    public String obterTresPrimeirasLetrasDoNome(){
        return this.nome.substring(0,3);
    }
    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", referencia='" + referencia + '\'' +
                ", idade=" + idade +
                ", dataDeCadastramento=" + dataDeCadastramento +
                '}';
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getReferencia() {return referencia;}

    public void setReferencia(String referencia) {this.referencia = referencia;}

    public Integer getIdade() {return idade;}

    public void setIdade(Integer idade) {this.idade = idade;}

    public LocalDate getDataDeCadastramento() {return dataDeCadastramento;}

    public void setDataDeCadastramento(LocalDate dataDeCadastramento) {this.dataDeCadastramento = dataDeCadastramento;}


}
