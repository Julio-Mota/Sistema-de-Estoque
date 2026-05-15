package com.desafio.estoque.dto.produto;

import jakarta.validation.constraints.NotBlank;

public record ProdutoRequest(
    @NotBlank(message = "Nome é obrigatório!")
    String nome
) {}