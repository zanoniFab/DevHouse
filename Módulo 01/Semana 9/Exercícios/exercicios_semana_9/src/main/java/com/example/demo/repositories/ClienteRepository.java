package com.example.demo.repositories;

import com.example.demo.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    boolean existsByCpf(String sku);


    boolean existsByIdNotAndCpf(Integer id, String cpf);
}
