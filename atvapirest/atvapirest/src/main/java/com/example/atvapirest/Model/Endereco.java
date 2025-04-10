package com.example.atvapirest.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Logadouro é obrigatorio")
    private String logadouro;
    @NotBlank(message = "Numero da casa é obrigatorio")
    private String numero;
    @NotBlank(message = "Cidade é obrigatorio")
     private String Cidade;

    public Endereco() {
    }

    public Endereco(Long id, String logadouro, String numero, String cidade) {
        this.id = id;
        this.logadouro = logadouro;
        this.numero = numero;
        Cidade = cidade;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }
}
