package com.desafio.estoque.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.estoque.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
    Optional<Produto> findByNome(String nome);
}