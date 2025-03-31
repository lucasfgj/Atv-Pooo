package com.example.senai_aula_02.service;

import com.example.senai_aula_02.model.Funcionario;
import com.example.senai_aula_02.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class FuncionarioService {
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> listarFuncionario(){
        return funcionarioRepository.findAll();
    }

    public Funcionario salvar(@Valid Funcionario funcionario){
        if(funcionarioRepository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new RuntimeException("Email já cadastrado");
        }
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario atualizar(@Valid Funcionario funcionario){
        Funcionario funcionarioAtualizar = funcionarioRepository.findByEmail(funcionario.getEmail()).orElseThrow(() -> new RuntimeException("Usuario não Cadastrado"));

        funcionarioAtualizar.setNome(funcionario.getNome());
        funcionarioAtualizar.setEmail(funcionario.getEmail());
        funcionarioAtualizar.setTelefone(funcionario.getTelefone());
        funcionarioAtualizar.setCpf(funcionario.getCpf());
        funcionarioAtualizar.setRg(funcionario.getRg());
        funcionarioAtualizar.setDataNascimento(funcionario.getDataNascimento());
        funcionarioAtualizar.setSalario(funcionario.getSalario());

        return funcionarioRepository.save(funcionarioAtualizar);
    }

    public void excluir(String email){
        Funcionario funcionario = funcionarioRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("Usuario não Cadastrado"));
        funcionarioRepository.deleteById(funcionario.getId());
    }
}
