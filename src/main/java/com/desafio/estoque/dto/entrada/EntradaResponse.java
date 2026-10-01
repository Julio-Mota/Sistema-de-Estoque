package com.desafio.estoque.dto.entrada;

import java.math.BigDecimal;
import java.util.List;

import com.desafio.estoque.model.Detalhe;
import com.desafio.estoque.model.Entrada;

public record EntradaResponse(
    Long id,
    java.time.LocalDateTime data_entrada,
    BigDecimal valor_total,
    List<Detalhe> itens
) {

    public EntradaResponse(Entrada entrada) {
        this(
            entrada.getIdEntrada(),
            entrada.getDataEntrada(),
            entrada.getValorTotal(),
            entrada.getItens()
        );
    }
}