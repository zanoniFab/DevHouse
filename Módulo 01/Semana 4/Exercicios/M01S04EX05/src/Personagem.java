public class Personagem {
    private String nome;
    private Tipo tipo;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Personagem:\n" +
                "{Nome: " + nome + ", Tipo: " + tipo + "}";
    }


}


