package com.desafio.estoque.dto.entrada;

import java.math.BigDecimal;

import com.desafio.estoque.model.Entrada;

public record EntradaResponse(
    Long id,
    java.time.LocalDateTime data_entrada,
    BigDecimal valor_total
) {

    public EntradaResponse(Entrada entrada) {
        this(
            entrada.getId(),
            entrada.getData_entrada(),
            entrada.getValor_total()
        );
    }
}