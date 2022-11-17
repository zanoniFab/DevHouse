package com.example.demo.services;


import com.example.demo.models.Produto;
import com.example.demo.models.Venda;
import com.example.demo.models.VendaItem;
import com.example.demo.repositories.ProdutoRepository;
import com.example.demo.repositories.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class VendaService {
    @Autowired private VendaRepository vendaRepository;
    @Autowired private ProdutoRepository produtoRepository;

    public List<Venda> buscar(){
        return vendaRepository.findAll();
    }
    public Venda salvar(Venda venda) throws Exception {
        BigDecimal vendaTotal = BigDecimal.ZERO;
        BigDecimal quantidade = BigDecimal.ZERO;
        for(VendaItem item:venda.getItens()){
            item.setVenda(venda);
            if(item.getQuantidade()==null||item.getQuantidade().compareTo(BigDecimal.ZERO)<=0){
                throw new Exception("Quantidade inválida!");
            }
            Produto produto = produtoRepository.findById(item.getProduto().getId()).get();
            item.setProduto(produto);
            item.setValorUnitario(produto.getValorUnitario());
            item.setValorTotal(item.getQuantidade().multiply(item.getValorUnitario()));
            vendaTotal = vendaTotal.add(item.getValorTotal());
            quantidade = quantidade.add(item.getQuantidade());
        }
        venda.setQuantidade(quantidade);
        venda.setValorTotal(vendaTotal);
        venda.setStatus("P");
//        if(venda.getId()!=null){
//            if(vendaRepository.existsByIdNotAndCpf(venda.getId(),venda.getCpf())){
//                throw new Exception("CPF já existente.");
//            }
//        } else{
//            if(vendaRepository.existsByCpf(venda.getCpf())){
//                throw new Exception("CPF já existente.");
//            }
//        }
//        if(venda.getCpf()==null || venda.getCpf().isEmpty()){
//            throw new Exception("CPF já existente.");
//        }
        return vendaRepository.save(venda);
    }
    public boolean apagar(Integer id){
        try {
            vendaRepository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public Venda buscarPorId(Integer id) {
        return vendaRepository.findById(id).get();
    }

    public List<Venda> buscarPorDatas(Date dataInicial, Date dataFinal) {
        if(dataInicial==null){
            return new ArrayList<>();
        }
        if(dataFinal==null){
            return vendaRepository.findByDataVendaAfter(dataInicial);
        }
        return vendaRepository.findByDataVendaBetween(dataInicial,dataFinal);
    }
    public List<Venda> buscarPorStatus(String status){
        return vendaRepository.findByStatusIgnoreCase(status);
    }

    public Venda cancelar(Integer id) {
        Venda venda = vendaRepository.findById(id).get();
        venda.setStatus("C");
        return vendaRepository.save(venda);
    }
}
