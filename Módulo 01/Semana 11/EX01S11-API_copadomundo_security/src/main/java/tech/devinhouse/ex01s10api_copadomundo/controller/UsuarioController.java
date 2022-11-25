package tech.devinhouse.ex01s10api_copadomundo.controller;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.ex01s10api_copadomundo.dto.*;
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
    private AuthenticationManager authManager;
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
    @PostMapping("login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request) {
        UsernamePasswordAuthenticationToken credentials = new UsernamePasswordAuthenticationToken(request.getEmail(), request.getSenha());
        Authentication authentication = authManager.authenticate(credentials);
        Usuario usuario = (Usuario) authentication.getPrincipal();
        String accessToken = service.generateToken(usuario);
        return ResponseEntity.ok(new LoginResponse(accessToken));
    }

}
