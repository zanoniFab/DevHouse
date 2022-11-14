package com.example.demo.services;


import com.example.demo.models.Cliente;
import com.example.demo.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> buscar(){
        return clienteRepository.findAll();
    }
    public Cliente salvar(Cliente cliente) throws Exception {
        if(cliente.getId()!=null){
            if(clienteRepository.existsByIdNotAndCpf(cliente.getId(),cliente.getCpf())){
                throw new Exception("CPF já existente.");
            }
        } else{
            if(clienteRepository.existsByCpf(cliente.getCpf())){
                throw new Exception("CPF já existente.");
            }
        }
        if(cliente.getCpf()==null || cliente.getCpf().isEmpty()){
            throw new Exception("CPF já existente.");
        }
        return clienteRepository.save(cliente);
    }
    public boolean apagar(Integer id){
        try {
            clienteRepository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }

}
