import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.CollationElementIterator;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Principal {
    public static void imprimirNroMaisAtrasado(List<Concurso> concursos) {
        // criando e populando map de nros sorteados e respectivas ultima data em que foram sorteados (data mais recente de sorteio)
        Map<Integer, LocalDate> map = new HashMap<>();
        for (Concurso concurso: concursos) {
            int[] sorteados = concurso.getSorteados();
            for (int i = 0; i < sorteados.length; i++) {
                int nro = sorteados[i];
                if (map.containsKey(nro)) {
                    LocalDate dataUltSorteio = map.get(nro);
                    if (concurso.getData().isAfter(dataUltSorteio)) {
                        map.put(nro, concurso.getData());
                    }
                } else {
                    map.put(nro, concurso.getData());
                }
            }
        }

        LocalDate dataMaisAntiga = LocalDate.now();
        int nroMaisAtrasado = 0;
        for(Integer nro: map.keySet()) {
            LocalDate data = map.get(nro);
            if (data.isBefore(dataMaisAntiga)) {
                dataMaisAntiga = data;
                nroMaisAtrasado = nro;
            }
        }

        System.out.println("Mais atrasado: " + nroMaisAtrasado);   // 24
    }
    public static void imprimirNrosFrequentes(List<Concurso> concursos) {
        // criando e populando Map de nros sorteados e respectivas quantidade em que foram sorteados
        Map<Integer, Integer> map = new HashMap<>();
        for (Concurso concurso: concursos) {
            int[] sorteados = concurso.getSorteados();
            for (int i = 0; i < sorteados.length; i++) {
                int nro = sorteados[i];
                int qtdAtual = map.getOrDefault(nro, 0);
                map.put(nro, qtdAtual + 1);
            }
        }
        // calculado as maiores e menores quantidades
        int nroMaisFrequente = 1;
        int nroMenosFrequente = 1;
        int qtdMaisFrequente = 0;
        int qtdMenosFrequente = Integer.MAX_VALUE;

        for(Integer nro: map.keySet()) {
            Integer qtd = map.get(nro);
            if (qtd > qtdMaisFrequente) {
                qtdMaisFrequente = qtd;
                nroMaisFrequente = nro;
            }
            if (qtd < qtdMenosFrequente) {
                qtdMenosFrequente = qtd;
                nroMenosFrequente = nro;
            }
        }

        System.out.println("Número mais frequente = " + nroMaisFrequente);
        System.out.println("Número menos frequente = " + nroMenosFrequente);
    }
    public static String verificarNumerosSorteados(List<Concurso> concursos){
        System.out.println("Informe seis dezenas separadas por virgula: ");
        Scanner scanner = new Scanner(System.in);
        String dezenasInformadas = scanner.next();
        String[] listaDezenas = dezenasInformadas.split(",");
        int[] dezenasConvertidas = new int[6];
        for (int i=0; i<6;i++){
            dezenasConvertidas[i]= Integer.parseInt(listaDezenas[i].trim());
        }
        Arrays.sort(dezenasConvertidas);

        int[] dezenasSorteadas;
        String retorno="";
        for(Concurso concurso : concursos){
            dezenasSorteadas = concurso.getSorteados();
            Arrays.sort(dezenasSorteadas);
            if(Arrays.toString(dezenasSorteadas).equals(Arrays.toString(dezenasConvertidas))){
                return Arrays.toString(dezenasSorteadas);
            } else {
                retorno = "Numeros nunca sorteados.";
            }
        }
        return retorno;
    }
    public static String verificarConcursoPorData(List<Concurso> concursos){
        System.out.println("Informe uma data para pesquisar se houve sorteio (no formato dd/MM/yyy): ");
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(scanner.next(), formatador);
        String retorno="";
        for (Concurso concurso:concursos){

            if (concurso.getData().equals(data) ){
                return Arrays.toString(concurso.getSorteados());
            } else {
                retorno = "Não houve sorteio neste dia.";
            }
        }
        return retorno;
    }

    public static void printarConcursos(List<Concurso> lista){
        for (Concurso concurso : lista){
            System.out.println(concurso);
        }
    }
    public static void ordenarConcursos(List<Concurso> lista) {
        Collections.sort(lista);
    }

    public static void main(String[] args) throws IOException {

        //recebeo arquivo
        Path arquivo = Paths.get("megasena.txt");
        //le o arquivo
        List<String> lista = Files.readAllLines(arquivo);

        List<Concurso> concursos = new ArrayList<>();
        //formata a data
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (String linha : lista){
            String[] partes = linha.split(",");
            Integer nro = Integer.valueOf(partes[0]);
            String dataStr = partes[1];
            LocalDate data = LocalDate.parse(dataStr, formatador);
            int[] sorteados = new int [6];

            for (int i=2; i <= 7; i++){
                sorteados[i-2]=Integer.parseInt(partes[i]);
            }
            Concurso concurso = new Concurso(nro,data,sorteados);
            concursos.add(concurso);
        }
        //printarConcursos(concursos);
        for (Concurso conc:concursos){
           // System.out.printf("Numeros sorteados em ordem crescente: %s\n",conc.SorteadosEmOrdemCrescente());
        }
        ordenarConcursos(concursos);
        //printarConcursos(concursos);

        //System.out.println(verificarConcursoPorData(concursos));
        //System.out.println(verificarNumerosSorteados(concursos));
        //imprimirNrosFrequentes(concursos);
        imprimirNroMaisAtrasado(concursos);
    }

}


