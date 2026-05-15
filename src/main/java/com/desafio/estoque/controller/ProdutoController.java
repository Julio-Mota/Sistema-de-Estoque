package com.desafio.estoque.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.estoque.dto.produto.ProdutoRequest;
import com.desafio.estoque.dto.produto.ProdutoResponse;
import com.desafio.estoque.service.ProdutoService;

import jakarta.validation.Valid;

@RequestMapping("/produtos")
@RestController
public class ProdutoController {
    
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ProdutoResponse criar(@RequestBody @Valid ProdutoRequest request) {
        return produtoService.criarProduto(request);
    }
}