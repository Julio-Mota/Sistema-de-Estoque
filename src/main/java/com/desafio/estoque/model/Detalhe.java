package com.desafio.estoque.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    //@Column //produto? Quer dizer o nome do produto que vem de Produto.java?

    // @Column //valor do que?

    //@Column //entrada(referência) do que?
}