package com.javaspring.aula.repository;

import com.javaspring.aula.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
}
