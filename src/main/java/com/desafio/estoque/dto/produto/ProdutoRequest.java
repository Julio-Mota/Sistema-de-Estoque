package com.desafio.estoque.dto.produto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ProdutoRequest(
    @NotBlank(message = "Nome é obrigatório!")
    String nome,

    @Positive(message = "O preço deverá ser maior que 0!")
    @NotNull
    BigDecimal preco
) {}