package com.example.demo.controllers;

import com.example.demo.models.Venda;
import com.example.demo.services.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="venda")
public class VendaController {
    @Autowired public VendaService vendaService;

    @PostMapping
    public Venda post(@RequestBody Venda venda) throws Exception {
        return vendaService.salvar(venda);
    }

}