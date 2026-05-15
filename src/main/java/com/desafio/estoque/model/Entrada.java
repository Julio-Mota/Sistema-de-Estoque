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

    @Override
    public String toString() {
        StringBuilder build02 = new StringBuilder();
        build02.append("Entradas{");
        build02.append("id_entrada=").append(id);
        build02.append(", data_entrada=").append(data_entrada);
        build02.append(", valor_total=").append(valor_total);
        build02.append("}");
        return build02.toString();
    }
}