package com.desafio.estoque.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.estoque.model.Entrada;

public interface EntradaRepository extends JpaRepository<Entrada, Long> {
    
    Optional<Entrada> findByItens(List itens);
}