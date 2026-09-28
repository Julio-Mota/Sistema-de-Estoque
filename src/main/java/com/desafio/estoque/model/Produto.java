package com.desafio.estoque.model;

import java.math.BigDecimal;

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
@Table(name = "Produto")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Long id;    

    @Column(length = 150, nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private Boolean ativo;

    @Column(nullable = false)
    private Integer saldo;

    @Column(nullable = false)
    @Positive(message = "O preço deverá ser maior que 0!")
    private BigDecimal preco;

    public Produto() {}

    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.ativo = true;
        this.saldo = 0;
        this.preco = preco;
    }

    @Override
    public String toString() {
        StringBuilder produtoBuild = new StringBuilder();
        produtoBuild.append("Produtos{");
        produtoBuild.append(", id_produto=").append(id);
        produtoBuild.append(", nome=").append(nome);
        produtoBuild.append(", ativo=").append(ativo);
        produtoBuild.append(", saldo=").append(saldo);
        produtoBuild.append(", preco=").append(preco);
        produtoBuild.append("}");
        return produtoBuild.toString();
    }
}