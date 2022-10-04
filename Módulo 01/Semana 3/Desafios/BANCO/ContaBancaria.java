package M01S03PRATICAS.BANCO;

import M01S03PRATICAS.BANCO.Cliente;

import java.time.LocalDateTime;

public class ContaBancaria {
    private String nome;
    private Integer agencia;
    private String conta;
    private double saldo;
    private Cliente cliente;
    private LocalDateTime dataCriacao;

    public void sacar (double valor){this.saldo-=valor;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public Integer getAgencia() {return agencia;}
    public void setAgencia(Integer agencia) {this.agencia = agencia;}

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
