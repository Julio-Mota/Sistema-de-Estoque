package com.desafio.estoque.dto.detalhe;

import java.math.BigDecimal;

import com.desafio.estoque.model.Detalhe;

public record DetalheResponse(
    Long id,
    Integer quantidade,
    BigDecimal valor
) {

    public DetalheResponse (Detalhe detalhe) {
        this(
            detalhe.getId(),
            detalhe.getQuantidade(),
            detalhe.getValor()
        );
    }
}