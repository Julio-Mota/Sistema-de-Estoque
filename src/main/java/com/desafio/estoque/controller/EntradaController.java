package com.desafio.estoque.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.estoque.dto.entrada.EntradaRequest;
import com.desafio.estoque.dto.entrada.EntradaResponse;
import com.desafio.estoque.service.EntradaService;

import jakarta.validation.Valid;

@RequestMapping("/entradas")
@RestController
public class EntradaController {
    
    private final EntradaService entradaService;

    public EntradaController(EntradaService entradaService) {
        this.entradaService = entradaService;
    }

    @PostMapping
    public EntradaResponse entrar(@RequestBody @Valid EntradaRequest request) {
        return entradaService.entrarEntrada(request);
    }
}