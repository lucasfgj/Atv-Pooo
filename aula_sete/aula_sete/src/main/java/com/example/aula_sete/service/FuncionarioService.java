package com.example.aula_sete.service;

import com.example.aula_sete.model.Funcionario;
import com.example.aula_sete.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Valid
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> listarFuncionario(){
        return funcionarioRepository.findAll();
    }

    public Funcionario salvar(@Valid Funcionario funcionario){
        if(funcionarioRepository.findByCpf(funcionario.getCpf()).isPresent()){
            throw new RuntimeException("CPF já cadastrado");
        }
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario atualizar(@Valid Funcionario funcionario){
        Funcionario funcionarioAtualizar = funcionarioRepository.findByCpf(funcionario.getCpf())
                .orElseThrow(() -> new RuntimeException("Funcionario não encontrado"));

        funcionarioAtualizar.setNome(funcionario.getNome());
        funcionarioAtualizar.setCpf(funcionario.getCpf());
        funcionarioAtualizar.setRg(funcionario.getRg());
        funcionarioAtualizar.setSetor(funcionario.getSetor());
        funcionarioAtualizar.setSalario(funcionario.getSalario());

        return funcionarioRepository.save(funcionarioAtualizar);
    }

    public void excluir(Long id){
        Funcionario funcionario = funcionarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario excluido com sucesso"));
        funcionarioRepository.deleteById(funcionario.getMatricula());
    }

}
