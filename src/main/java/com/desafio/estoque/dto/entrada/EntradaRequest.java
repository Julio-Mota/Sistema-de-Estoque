package com.desafio.estoque.dto.entrada;

import java.util.List;

import com.desafio.estoque.dto.detalhe.DetalheRequest;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

public record EntradaRequest(
    @NotEmpty
    List<@Valid DetalheRequest> itens
) {}