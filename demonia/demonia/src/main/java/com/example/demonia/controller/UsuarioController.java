package com.example.demonia.controller;

import com.example.demonia.dto.UsuarioDTO;
import com.example.demonia.dto.UsuarioResponseDTO;
import com.example.demonia.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public class UsuarioController {
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listarTodos(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(usuarioService.listarTodos());
    }

    public ResponseEntity<Map<Object, String>> salvar(@Valid @RequestBody UsuarioDTO dto){
         usuarioService.salvarUsuario(dto);
         return ResponseEntity
                 .status(HttpStatus.CREATED)
                 .body(Map.of("mensagem", "Usuario cadastrado com sucesso."));
    }
}
