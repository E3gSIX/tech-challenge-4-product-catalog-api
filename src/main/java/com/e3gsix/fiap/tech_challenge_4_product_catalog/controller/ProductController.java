package com.e3gsix.fiap.tech_challenge_4_product_catalog.controller;

import com.e3gsix.fiap.tech_challenge_4_product_catalog.dto.ProductCreationRequestDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.util.UriComponentsBuilder;

@Tag(
        name = "Catálogo de Produtos [ProductController]",
        description = "Controlador que fornece os serviços de gerenciamento de produtos."
)
public interface ProductController {

    @Operation(summary = "Criar um produto.")
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity create(
            @Parameter(description = "Descrição do produto a ser criado.") ProductCreationRequestDTO productCreationRequestDTO,
            @Parameter(hidden = true) UriComponentsBuilder uriComponentsBuilder
    );

    @Operation(summary = "Buscar um produto pelo ID.")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity findById(
            @Parameter(description = "ID do produto a ser consultado.") Long productId
    );
}
