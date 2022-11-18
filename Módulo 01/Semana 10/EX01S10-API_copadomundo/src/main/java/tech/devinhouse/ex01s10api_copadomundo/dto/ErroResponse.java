package tech.devinhouse.ex01s10api_copadomundo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErroResponse {

    private String mensagem;

    private Map<String, String> detalhes;

    public ErroResponse(String mensagem) {
        this.mensagem = mensagem;
    }

}