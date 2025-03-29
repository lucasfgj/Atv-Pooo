package com.example.senai_aula_02.controller;

import com.example.senai_aula_02.model.Usuario;
import com.example.senai_aula_02.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> listarTodos(){
         return usuarioService.listarUsuario();
    }

    @PostMapping
    public ResponseEntity<String> salvar(@Valid @RequestBody Usuario usuario){
        usuarioService.salvar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuario " + usuario.getNome() + " Cadastrado com Sucesso");
    }

    @PutMapping
    public ResponseEntity<Usuario> atualizar(@Valid @RequestBody Usuario usuario){
        usuarioService.atualizar(usuario);
        return ResponseEntity.ok().body(usuario);
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<Void> excluir(@PathVariable String email){
        usuarioService.excluir(email);
        return ResponseEntity.noContent().build();
    }
}
