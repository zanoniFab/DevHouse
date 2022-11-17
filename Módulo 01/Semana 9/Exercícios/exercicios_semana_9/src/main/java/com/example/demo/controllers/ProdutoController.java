package com.example.demo.controllers;

import com.example.demo.models.Produto;
import com.example.demo.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="produto")
public class ProdutoController {
    @Autowired public ProdutoService produtoService;

    @GetMapping
    public List<Produto> get(){
        return produtoService.buscar();
    }
    @PostMapping
    public Produto post(@RequestBody Produto produto) throws Exception {
        return produtoService.salvar(produto);
    }
    @PutMapping
    public Produto put(@RequestBody Produto produto) throws Exception {
        return produtoService.salvar(produto);
    }
    @DeleteMapping
    public boolean delete(Integer id){
        return produtoService.apagar(id);
    }
}
