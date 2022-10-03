package M01S03EX01;

import M01S03EX01.Funcionario;

public class TesteF {
        public static void main (String[] args){
            Funcionario funcionario = new Funcionario();
            funcionario.setNome("Cristiane");
            funcionario.setSobrenome("Zanoni");
            funcionario.setSalario(1000f);
            funcionario.setCpf(1234567890L);
            System.out.println("Salario inicial: "+funcionario.getSalario());
            System.out.println("Nome Funcionario: "+funcionario.getNome());
            System.out.println("Nome completo funcionario: "+funcionario.getNomeCompleto());

            funcionario.promover(10f);
            System.out.println("Salario com aumento: "+funcionario.getSalario());
        }
}
