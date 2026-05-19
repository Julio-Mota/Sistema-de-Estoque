package com.desafio.estoque.model;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.desafio.estoque.dto.detalhe.DetalheRequest;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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

    @OneToMany(mappedBy = "entrada", cascade = CascadeType.ALL)
    private List<DetalheRequest> itens;

    public Entrada() {}

    public Entrada(List<DetalheRequest> itens, BigDecimal valor_total) {
        this.itens = itens;
        this.valor_total = valor_total;
    }

    @Override
    public String toString() {
        StringBuilder entradaBuild = new StringBuilder();
        entradaBuild.append("Entradas{");
        entradaBuild.append("id_entrada=").append(id);
        entradaBuild.append(", data_entrada=").append(data_entrada);
        entradaBuild.append(", valor_total=").append(valor_total);
        entradaBuild.append(", itens=").append(itens);
        entradaBuild.append("}");
        return entradaBuild.toString();
    }
}