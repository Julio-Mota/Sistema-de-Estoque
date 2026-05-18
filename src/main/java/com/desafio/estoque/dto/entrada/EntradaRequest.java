package com.desafio.estoque.dto.entrada;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;

public record EntradaRequest(
    @NotBlank(message = "Valor total é obrigatório!")
    BigDecimal valor_total
) {}