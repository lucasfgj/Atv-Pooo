package com.example.atvapirest.Service;

import com.example.atvapirest.Model.Funcionario;
import com.example.atvapirest.Repository.FuncionarioRepository;
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

    public List<Funcionario> listarTodos() {
        return funcionarioRepository.findAll();
    }

    public Funcionario salvar(@Valid Funcionario funcionario){
        if(funcionarioRepository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new RuntimeException("Email já cadastrado");
        }
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario atualizar(@Valid Funcionario funcionario){
        Funcionario funcAtualizar = funcionarioRepository.findByEmail(funcionario.getEmail())
                .orElseThrow(() -> new RuntimeException("Funcionario já cadastrado"));

        funcAtualizar.setNome(funcionario.getNome());
        funcAtualizar.setNome(funcionario.getEmail());
        funcAtualizar.setEndenreco(funcionario.getEndenreco());
        funcAtualizar.setSexo(funcionario.getSexo());
        funcAtualizar.setSalario(funcionario.getSalario());

        return funcionarioRepository.save(funcAtualizar);
    }

    public void excluir(Long id){
        Funcionario funcionario = funcionarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionario excluido"));
        funcionarioRepository.deleteById(funcionario.getId());
    }
}
