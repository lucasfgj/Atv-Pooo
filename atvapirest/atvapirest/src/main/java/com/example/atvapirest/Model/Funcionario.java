package com.example.atvapirest.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

@Entity
@Validated
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Nome é obrigatorio")
    private String nome;
    @Email
    @NotBlank(message = "Email é obrigatorio")
    private String email;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @Min(1412)
    private double salario;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;


    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String email, Sexo sexo, double salario, Endereco endenreco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.salario = salario;
        this.endenreco = endenreco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndenreco() {
        return endenreco;
    }

    public void setEndenreco(Endereco endenreco) {
        this.endenreco = endenreco;
    }
}
