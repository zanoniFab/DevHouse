package tech.devinhouse.ex01s10api_copadomundo.controller;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.ex01s10api_copadomundo.dto.SelecaoRequest;
import tech.devinhouse.ex01s10api_copadomundo.dto.SelecaoResponse;
import tech.devinhouse.ex01s10api_copadomundo.model.Selecao;
import tech.devinhouse.ex01s10api_copadomundo.service.SelecaoService;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/selecoes")
@AllArgsConstructor
@Validated


public class SelecaoController {
    private SelecaoService service;
    private ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<SelecaoResponse>> consultar(
                @RequestParam(value = "direction", required = false, defaultValue = "ASC") String direcao,
                @RequestParam(value = "size", required = false, defaultValue = "3") Integer tamanho,
                @RequestParam(value = "page", required = false, defaultValue = "0") Integer pagina,
                @RequestParam(value = "sort", required = false, defaultValue = "nome") String ordenacao
                ) {
            List<Selecao> selecoes = service.consultar(direcao, tamanho, pagina, ordenacao);
            List<SelecaoResponse> resp = new ArrayList<>();
            for (Selecao selecao: selecoes) {
                SelecaoResponse r = mapper.map(selecao, SelecaoResponse.class);
                resp.add(r);
            }
        return ResponseEntity.ok(resp);
    }
    @PostMapping
    public ResponseEntity<SelecaoResponse> inserir(@RequestBody @Valid SelecaoRequest request) {
        Selecao selecao = mapper.map(request, Selecao.class);
        selecao = service.inserir(selecao);
        SelecaoResponse resp = mapper.map(selecao, SelecaoResponse.class);
        return ResponseEntity.created(URI.create(resp.getNome())).body(resp);
    }
}

