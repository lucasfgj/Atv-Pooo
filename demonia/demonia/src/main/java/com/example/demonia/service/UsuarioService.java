package com.example.demonia.service;

import com.example.demonia.dto.UsuarioDTO;
import com.example.demonia.dto.UsuarioResponseDTO;
import com.example.demonia.model.Usuario;
import com.example.demonia.repository.UsuarioRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UsuarioService(UsuarioRepository usuarioRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public Usuario salvarUsuario(UsuarioDTO dto) {
        usuarioRepository.findByEmail(dto.getEmail())
                .ifPresent(u -> {
                    throw new IllegalArgumentException("Email já cadastrado");
                });

        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(bCryptPasswordEncoder.encode(dto.getSenha()));//CRIPTOGRAFANDO A SENHA!!!!

        return usuarioRepository.save(usuario);
    }

    public List<UsuarioResponseDTO> listarTodosUsuarios(){
        return usuarioRepository.findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }
    private UsuarioResponseDTO toDTO(Usuario usuario){
        return new UsuarioResponseDTO(usuario.getNome(), usuario.getEmail());
    }

}

