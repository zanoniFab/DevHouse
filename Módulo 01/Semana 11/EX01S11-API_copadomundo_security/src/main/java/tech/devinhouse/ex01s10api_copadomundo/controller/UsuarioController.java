package tech.devinhouse.ex01s10api_copadomundo.controller;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.ex01s10api_copadomundo.dto.SelecaoResponse;
import tech.devinhouse.ex01s10api_copadomundo.dto.UsuarioRequest;
import tech.devinhouse.ex01s10api_copadomundo.dto.UsuarioResponse;
import tech.devinhouse.ex01s10api_copadomundo.model.Selecao;
import tech.devinhouse.ex01s10api_copadomundo.model.Usuario;
import tech.devinhouse.ex01s10api_copadomundo.service.UsuarioService;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/usuarios")
@AllArgsConstructor
public class UsuarioController {

    private ModelMapper mapper;
    private UsuarioService service;
    @PostMapping
    public ResponseEntity<UsuarioResponse> inserir(@RequestBody @Valid UsuarioRequest request){
        Usuario usuario = mapper.map(request, Usuario.class);
        usuario = service.criar(usuario);
        UsuarioResponse resp = mapper.map(usuario, UsuarioResponse.class);
        return ResponseEntity.created(URI.create(resp.getId().toString())).body(resp);

    }
    @GetMapping
    public ResponseEntity<List<UsuarioResponse>> consultar() {
        List<Usuario> lista = service.consultar();
        List<UsuarioResponse> resp= new ArrayList<>();
        for(Usuario usuario : lista)
            resp.add(mapper.map(usuario,UsuarioResponse.class));
        return ResponseEntity.ok(resp);
    }
}
