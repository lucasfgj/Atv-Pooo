package com.example.atvapirest.Controller;

import com.example.atvapirest.Model.Funcionario;
import com.example.atvapirest.Service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTMLEditorKit;
import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    private FuncionarioService funcionarioService;

    public FuncionarioController (FuncionarioService funcionarioService){
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    public List<Funcionario> listarTodos(){
        return funcionarioService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<String> salvar(@Valid @RequestBody Funcionario funcionario){
        funcionarioService.salvar(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body("Funcionario " + funcionario.getNome() + " Cadastrado com Sucesso");
    }

    @PutMapping
    public ResponseEntity<String> atualizar(@Valid @RequestBody Funcionario funcionario){
        funcionarioService.atualizar(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body("Funcionario " + funcionario.getNome() + " Atualizado com Sucesso");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@Valid @RequestBody Long id){
        funcionarioService.excluir(id);
        return ResponseEntity.status(HttpStatus.CREATED).body("Funcionario Deletado com Sucesso");
    }
}
