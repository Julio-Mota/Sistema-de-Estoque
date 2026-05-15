package com.desafio.estoque.model;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Saida")
public class Saida {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_saida")
    private Long id;

    @CreationTimestamp
    @Column(nullable = false)
    private java.time.LocalDateTime data_saida;

    //@Column //produto? Quer dizer o nome do produto que vem de Produto.java?

    //@Column //quantidade de Detalhe.java?

    //@Column //valor_total de Entrada.java?
}