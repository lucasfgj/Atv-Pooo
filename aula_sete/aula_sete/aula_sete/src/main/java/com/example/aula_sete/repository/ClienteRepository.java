package com.example.aula_sete.repository;

import com.example.aula_sete.model.Cliente;
import com.example.aula_sete.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Usuario, Long> {
    Optional<Cliente> findByEmail(String email);
}
