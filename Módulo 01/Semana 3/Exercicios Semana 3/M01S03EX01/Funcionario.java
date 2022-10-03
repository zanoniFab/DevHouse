package M01S03EX01;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private float salario;
    private long cpf;

    //getters
    public String getNome(){return nome;}
    public String getNomeCompleto(){return this.nome+" "+sobrenome;}
    public float getSalario(){return salario;}
    public long getCpf(){return cpf;}

    //setters
    public void setNome(String nome){ this.nome=nome;}
    public void setSobrenome(String sobrenome){this.sobrenome=sobrenome;}
    public void setSalario(float salario){this.salario=salario;}
    public void setCpf(long cpf){this.cpf=cpf;}

    public void promover(float percentual) {
        float aumento = this.salario*(percentual/100);

        setSalario(this.salario+=aumento);
    }
}

