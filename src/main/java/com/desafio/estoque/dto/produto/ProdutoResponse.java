package com.desafio.estoque.dto.produto;

import java.math.BigDecimal;

import com.desafio.estoque.model.Produto;

public record ProdutoResponse(
    Long id,
    String nome,
    Boolean ativo,
    Integer saldo,
    BigDecimal preco
) {

    public ProdutoResponse(Produto produto) {
        this(
            produto.getId(),
            produto.getNome(),
            produto.getAtivo(),
            produto.getSaldo(),
            produto.getPreco()
        );
    }
}