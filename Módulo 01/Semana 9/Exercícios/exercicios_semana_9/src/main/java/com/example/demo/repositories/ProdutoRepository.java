package com.example.demo.repositories;

import com.example.demo.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    boolean existsBySku(String sku);


    boolean existsByIdNotAndSku(Integer id, String sku);
}
