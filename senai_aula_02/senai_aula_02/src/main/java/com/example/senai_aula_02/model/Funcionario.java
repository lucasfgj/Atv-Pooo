package com.example.senai_aula_02.model;

import jakarta.persistence.Entity;

@Entity
public class Funcionario {
    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    private String matricula;
    private String dataNascimento;
    private Sexo sexo;
    private Setor setor;
    private double salario;
    private String telefone;
    private String Email;
    private Endereco endereco;

}
