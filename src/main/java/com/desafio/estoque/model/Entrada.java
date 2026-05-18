package com.desafio.estoque.model;

import java.math.BigDecimal;

import org.hibernate.annotations.CreationTimestamp;

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
@Table(name = "Entrada")
public class Entrada {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrada")
    private Long id;

    @CreationTimestamp
    @Column(nullable = false)
    private java.time.LocalDateTime data_entrada;

    @Column(nullable = false)
    @Positive
    private BigDecimal valor_total;

    public Entrada(BigDecimal valor_total) {
        this.valor_total = valor_total;
    }

    @Override
    public String toString() {
        StringBuilder entradaBuild = new StringBuilder();
        entradaBuild.append("Entradas{");
        entradaBuild.append("id_entrada=").append(id);
        entradaBuild.append(", data_entrada=").append(data_entrada);
        entradaBuild.append(", valor_total=").append(valor_total);
        entradaBuild.append("}");
        return entradaBuild.toString();
    }
}