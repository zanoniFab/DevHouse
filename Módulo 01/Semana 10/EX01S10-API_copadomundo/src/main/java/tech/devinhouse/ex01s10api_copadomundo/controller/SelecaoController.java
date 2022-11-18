package tech.devinhouse.ex01s10api_copadomundo.controller;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.devinhouse.ex01s10api_copadomundo.dto.SelecaoRequest;
import tech.devinhouse.ex01s10api_copadomundo.dto.SelecaoResponse;
import tech.devinhouse.ex01s10api_copadomundo.model.Selecao;
import tech.devinhouse.ex01s10api_copadomundo.service.SelecaoService;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("api/v1/selecoes")
@AllArgsConstructor
@Validated


public class SelecaoController {
    private SelecaoService service;
    private ModelMapper mapper;

    @PostMapping
    public ResponseEntity<SelecaoResponse> inserir(@RequestBody @Valid SelecaoRequest request) {
        Selecao selecao = mapper.map(request, Selecao.class);
        selecao = service.inserir(selecao);
        SelecaoResponse resp = mapper.map(selecao, SelecaoResponse.class);
        return ResponseEntity.created(URI.create(resp.getNome())).body(resp);
    }
}

