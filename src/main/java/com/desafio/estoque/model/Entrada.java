package com.desafio.estoque.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

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
@Table(name = "entrada")
public class Entrada {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrada")
    private Long idEntrada;

    @CreationTimestamp
    @Column(name = "data_entrada", nullable = false)
    private LocalDateTime dataEntrada;

    @Column(name = "valor_total", nullable = false)
    @Positive(message = "O valor total deverá ser maior que 0!")
    private BigDecimal valorTotal;

    @OneToMany(mappedBy = "entrada", cascade = CascadeType.ALL)
    private List<Detalhe> itens;

    public Entrada() {}

    public Entrada(List<Detalhe> itens, BigDecimal valorTotal) {
        this.itens = itens;
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        StringBuilder entradaBuild = new StringBuilder();
        entradaBuild.append("Entradas{");
        entradaBuild.append("id_entrada=").append(idEntrada);
        entradaBuild.append(", data_entrada=").append(dataEntrada);
        entradaBuild.append(", valor_total=").append(valorTotal);
        entradaBuild.append(", itens=").append(itens);
        entradaBuild.append("}");
        return entradaBuild.toString();
    }
}