package com.example.demo.services;


import com.example.demo.models.Produto;
import com.example.demo.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    public List<Produto> buscar(){
        return produtoRepository.findAll();
    }
    public Produto salvar(Produto produto){
        return produtoRepository.save(produto);
    }
    public boolean apagar(Integer id){
        try {
            produtoRepository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }

}
