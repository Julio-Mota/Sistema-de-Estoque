package com.desafio.estoque.dto.entrada;

import java.util.List;
import java.math.BigDecimal;

import com.desafio.estoque.dto.detalhe.DetalheRequest;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record EntradaRequest(
    @NotEmpty
    List<@Valid DetalheRequest> itens,

    @Positive(message = "O valor total deverá ser maior que 0!")
    @NotNull
    BigDecimal valor_total
) {}