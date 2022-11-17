package com.example.demo.controllers;

import com.example.demo.models.Cliente;
import com.example.demo.models.Produto;
import com.example.demo.services.ClienteService;
import com.example.demo.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="cliente")
public class ClienteController {
    @Autowired public ClienteService clienteService;

    @GetMapping
    public List<Cliente> get(){
        return clienteService.buscar();
    }
    @PostMapping
    public Cliente post(@RequestBody Cliente cliente) throws Exception {
        return clienteService.salvar(cliente);
    }
    @PutMapping
    public Cliente put(@RequestBody Cliente cliente) throws Exception {
        return clienteService.salvar(cliente);
    }
    @DeleteMapping
    public boolean delete(Integer id){
        return clienteService.apagar(id);
    }
}
