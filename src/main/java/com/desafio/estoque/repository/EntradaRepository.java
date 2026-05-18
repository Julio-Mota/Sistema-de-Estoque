package com.desafio.estoque.repository;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.estoque.model.Entrada;

public interface EntradaRepository extends JpaRepository<Entrada, BigDecimal> {
    
    Optional<Entrada> findByValor_total(BigDecimal valor_total);
}