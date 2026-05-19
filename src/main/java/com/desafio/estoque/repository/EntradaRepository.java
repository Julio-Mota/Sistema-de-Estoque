package com.desafio.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.estoque.model.Entrada;

public interface EntradaRepository extends JpaRepository<Entrada, Long> {
    
}