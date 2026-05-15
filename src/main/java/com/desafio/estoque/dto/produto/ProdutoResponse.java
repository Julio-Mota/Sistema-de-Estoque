package com.desafio.estoque.dto.produto;

import com.desafio.estoque.model.Produto;

public record ProdutoResponse(
    Long id,
    String nome,
    Boolean ativo,
    Integer saldo
) {

    public ProdutoResponse(Produto produto) {
        this(
            produto.getId(),
            produto.getNome(),
            produto.getAtivo(),
            produto.getSaldo()
        );
    }
}