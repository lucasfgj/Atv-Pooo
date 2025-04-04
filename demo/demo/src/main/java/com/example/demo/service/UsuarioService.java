package com.example.demo.service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

    public Object salvar(@Valid Usuario usuario){
        if(usuarioRepository.findByEmail(usuario.getEmail()).isPresent()){
            throw new RuntimeException("Email já cadastrado");
        }
        return usuarioRepository.save(usuario);
    }

    public Object atualizar(@Valid Usuario usuario){
        Usuario usuarioAtualizar = usuarioRepository.findByEmail(usuario.getEmail())
                .orElseThrow(()-> new RuntimeException("Usuario não encontrado"));

        usuarioAtualizar.setNome(usuario.getNome());
        usuarioAtualizar.setEmail(usuario.getEmail());
        usuarioAtualizar.setSenha(usuario.getSenha());

        return usuarioRepository.save(usuarioAtualizar);
    }

    public void excluir(Long id){
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario não encontrado"));

        usuarioRepository.deleteById(usuario.getId());
    }
}

