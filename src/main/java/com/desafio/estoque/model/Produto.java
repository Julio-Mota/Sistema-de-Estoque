package com.desafio.estoque.model;

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

    @Column
    private Integer saldo;

    public Produto(String nome) {
        this.nome = nome;
        this.ativo = true;
        this.saldo = 0;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Produtos{");
        build.append(", id_produto=").append(id);
        build.append(", nome=").append(nome);
        build.append(", ativo=").append(ativo);
        build.append(", saldo=").append(saldo);
        build.append("}");
        return build.toString();
    }
}