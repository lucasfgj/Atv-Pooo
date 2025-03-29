package com.example.senai_aula_02.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "0 none")
    private String nome;

    @NotBlank(message = "O nome é obrigatorio")
    @Email(message = "Informe um Email valido")
    private String email;

    @NotBlank(message = "A senha é obrigatoria")
    @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres")
    private String senha;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "0 none") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "0 none") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O nome é obrigatorio") @Email(message = "Informe um Email valido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O nome é obrigatorio") @Email(message = "Informe um Email valido") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatoria") @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatoria") @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres") String senha) {
        this.senha = senha;
    }
}
