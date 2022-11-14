package com.example.demo.repositories;

import com.example.demo.models.Produto;
import com.example.demo.models.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {

}
