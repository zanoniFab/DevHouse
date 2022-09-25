public class exercicio8 {
    public static void main(String[] args) {
        String nomeTime = "Tabajara F.C";
        int vitorias = 12;
        int derrotas = 2;
        int empates = 6;
        int partidas = vitorias + derrotas + empates;
        int pontos = (vitorias*3) + empates;
//        System.out.println("O time " + nomeTime + " acumulou "+ pontos + " pontos após jogar " + partidas + " partidas.");
//        %s substitui por string %d por numero int %f por float
        System.out.printf("O time %s acumulou %d pontos após jogar %d partidas.",nomeTime,pontos,partidas);
    }
}
