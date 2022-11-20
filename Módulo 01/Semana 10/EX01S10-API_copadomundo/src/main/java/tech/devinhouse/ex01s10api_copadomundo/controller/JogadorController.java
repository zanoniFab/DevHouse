package tech.devinhouse.ex01s10api_copadomundo.controller;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.ex01s10api_copadomundo.dto.JogadorRequest;
import tech.devinhouse.ex01s10api_copadomundo.dto.JogadorResponse;
import tech.devinhouse.ex01s10api_copadomundo.model.Jogador;
import tech.devinhouse.ex01s10api_copadomundo.service.JogadorService;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("api/v1/selecoes/{sigla}/jogadores")
@AllArgsConstructor
public class JogadorController {

    private JogadorService service;
    private ModelMapper mapper;

    @PostMapping
    public ResponseEntity<JogadorResponse> criar(@PathVariable("sigla") String sigla, @RequestBody @Valid JogadorRequest request) {
        Jogador jogador = mapper.map(request, Jogador.class);
        jogador = service.criar(sigla, jogador);
        JogadorResponse resp = mapper.map(jogador, JogadorResponse.class);
        return ResponseEntity.created(URI.create(resp.getId().toString())).body(resp);
    }
}
