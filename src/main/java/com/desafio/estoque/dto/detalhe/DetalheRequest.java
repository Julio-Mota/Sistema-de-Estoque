package com.desafio.estoque.dto.detalhe;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record DetalheRequest(

    @NotNull
    Long id_produto,

    @NotNull
    @Positive
    Integer quantidade,

    @NotNull
    @Positive
    BigDecimal valor
) {}