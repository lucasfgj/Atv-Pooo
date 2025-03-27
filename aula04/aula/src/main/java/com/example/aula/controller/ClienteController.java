package com.example.aula.controller;


import com.example.aula.model.Cliente;
import com.example.aula.repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private ClienteRepository clienteRepository;

    public ClienteRepository getClienteRepository() {
        return clienteRepository;
    }

    @GetMapping
    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

    @PutMapping
    public ResponseEntity<Cliente> atualizar(@RequestBody Cliente cliente){
        if(clienteRepository.existsById(cliente.getId())){
            clienteRepository.save(cliente);
        }
        return ResponseEntity.ok().body(cliente);
    }



    @DeleteMapping("/{Id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        clienteRepository.existsById(id);
        return ResponseEntity.noContent().build();
    }

}
