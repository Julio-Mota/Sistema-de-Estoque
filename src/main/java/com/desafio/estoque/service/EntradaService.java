package com.desafio.estoque.service;

import org.springframework.stereotype.Service;

import com.desafio.estoque.dto.entrada.EntradaRequest;
import com.desafio.estoque.dto.entrada.EntradaResponse;
import com.desafio.estoque.model.Entrada;
import com.desafio.estoque.repository.EntradaRepository;

@Service
public class EntradaService {
    
    private final EntradaRepository entradaRepository;

    public EntradaService(EntradaRepository entradaRepository) {
        this.entradaRepository = entradaRepository;
    }

    public EntradaResponse entrarEntrada(EntradaRequest entradaRequest) {
        Entrada entrada = new Entrada(
            entradaRequest.valor_total()
        );

        if (entradaRepository.findByValor_total(entradaRequest.valor_total()).isPresent()) {
        throw new RuntimeException("O valor total já existe!");
        }

        Entrada entradaSalvo = entradaRepository.save(entrada);
        return new EntradaResponse(entradaSalvo);
    }
}