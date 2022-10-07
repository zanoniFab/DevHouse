public abstract class Funcionario {
    private String nome;
    private Integer matricula;
    private Long cpf;

    public abstract String obterCategoria();

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public Integer getMatricula() {return matricula;}
    public void setMatricula(Integer matricula) {this.matricula = matricula;}
    public Long getCpf() {return cpf;}
    public void setCpf(Long cpf) {this.cpf = cpf;}
}

