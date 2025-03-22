package com.javaspring.aula.controller;


import com.javaspring.aula.model.Funcionario;
import com.javaspring.aula.model.Usuario;
import com.javaspring.aula.repository.FuncionarioRepository;
import com.javaspring.aula.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    @PostMapping
    public ResponseEntity<Funcionario> salvar(@RequestBody Funcionario funcionario){
        funcionarioRepository.save(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);
    }

    @GetMapping
    public List<Funcionario> listarFuncionario(){
        return funcionarioRepository.findAll();
    }

    @DeleteMapping("{/id}")
    public ResponseEntity<Void> excluirFuncionario(@PathVariable Long id){
        funcionarioRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Funcionario> atualizarFuncionario(@RequestBody Funcionario funcionario){
        funcionarioRepository.save(funcionario);
        return ResponseEntity.ok().body(funcionario);
    }



}
