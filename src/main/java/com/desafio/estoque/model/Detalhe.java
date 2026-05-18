package com.desafio.estoque.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Detalhe")
public class Detalhe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalhe")
    private Long id;

    @Column(nullable = false)
    @Positive
    private Integer quantidade;

    @Column(nullable = false)
    @Positive
    private BigDecimal valor;
    
    @ManyToOne
    @JoinColumn(name = "id_entrada")
    private Entrada entrada;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;
}