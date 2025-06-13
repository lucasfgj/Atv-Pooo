package com.example.demonia.repository;

import com.example.demonia.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository {
    Optional<Usuario> findByEmail(String email);
}
