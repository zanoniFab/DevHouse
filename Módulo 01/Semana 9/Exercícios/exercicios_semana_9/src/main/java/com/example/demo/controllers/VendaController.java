package com.example.demo.controllers;

import com.example.demo.models.Venda;
import com.example.demo.services.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "venda")
public class VendaController {
    @Autowired
    public VendaService vendaService;

    @GetMapping(path = "{id}")
    public Venda getId(@PathVariable("id") Integer id) {
        return vendaService.buscarPorId(id);
    }
    @GetMapping(path="porDatas")
    public List<Venda> getPorDatas(
            @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) Date dataInicial,
            @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) Date dataFinal)
    {
        return vendaService.buscarPorDatas(dataInicial,dataFinal);
    }
    @GetMapping(path="porStatus")
    public List<Venda>getPorStatus (String status){
        return vendaService.buscarPorStatus(status);
    }

    @PostMapping
    public Venda post(@RequestBody Venda venda) throws Exception {
        return vendaService.salvar(venda);
    }
    @DeleteMapping(path = "{id}")
    public Venda delete(@PathVariable("id") Integer id) {
        return vendaService.cancelar(id);
    }

}