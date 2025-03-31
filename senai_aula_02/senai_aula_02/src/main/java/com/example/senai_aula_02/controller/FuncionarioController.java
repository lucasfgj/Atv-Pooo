package com.example.senai_aula_02.controller;

import com.example.senai_aula_02.model.Funcionario;
import com.example.senai_aula_02.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    private FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    public List<Funcionario> listarTodos(){
        return  funcionarioService.listarFuncionario();
    }

    @PostMapping
    public ResponseEntity<String> salvar(@Valid @RequestBody Funcionario funcionario){
        funcionarioService.salvar(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                "Funcionario" + funcionario.getNome() + "Cadastrado com sucesso!!");
    }

    @PutMapping
    public ResponseEntity<Funcionario> atualizar(@Valid @RequestBody Funcionario funcionario){
        funcionarioService.atualizar(funcionario);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<Void> excluir(@PathVariable String email){
        funcionarioService.excluir(email);
        return ResponseEntity.noContent().build();
    }
}
