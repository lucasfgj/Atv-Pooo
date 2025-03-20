package com.javaspring.aula.service;

import com.javaspring.aula.model.Usuario;
import com.javaspring.aula.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario){
        try{
            return usuarioRepository.save(usuario);
        }catch(Exception erro){
            throw new RuntimeException(erro);
        }

    }

    public List<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }

    public Usuario atualizar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public void deletar(Long id){
         usuarioRepository.deleteById(id);
    }
}
