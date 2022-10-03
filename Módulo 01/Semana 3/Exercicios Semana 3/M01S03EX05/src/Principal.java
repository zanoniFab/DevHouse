import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.CollationElementIterator;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Principal {
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
        printarConcursos(concursos);
        for (Concurso conc:concursos){
            System.out.printf("Numeros sorteados em ordem crescente: %s\n",conc.SorteadosEmOrdemCrescente());
        }
        ordenarConcursos(concursos);
        printarConcursos(concursos);

    }

}


