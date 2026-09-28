package com.desafio.estoque.service;

import org.springframework.stereotype.Service;

import com.desafio.estoque.dto.produto.ProdutoRequest;
import com.desafio.estoque.dto.produto.ProdutoResponse;
import com.desafio.estoque.model.Produto;
import com.desafio.estoque.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public ProdutoResponse criarProduto(ProdutoRequest produtoRequest) {
        
        if (produtoRepository.findByNome(produtoRequest.nome()).isPresent()) {
        throw new IllegalArgumentException("O produto já existe!");
        }

        Produto produto = new Produto(
            produtoRequest.nome(),
            produtoRequest.preco()
        );

        Produto produtoSalvo = produtoRepository.save(produto);
        return new ProdutoResponse(produtoSalvo);
    }
}