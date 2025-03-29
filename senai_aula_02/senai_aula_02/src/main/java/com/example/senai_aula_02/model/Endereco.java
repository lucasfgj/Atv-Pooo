package com.example.senai_aula_02.model;

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

    @NotBlank(message = "Logadouro não pode ser vazio!")
    private String logadouro;

    @NotBlank(message = "Numero não pode ser vazio!")
    private String numero;

    @NotBlank(message = "Complemento não pode ser vazio!")
    private String complemento;

    @NotBlank(message = "CEP não pode ser vazio!")
    private String cep;

    @NotBlank(message = " Cidade não pode ser vazio!")
    private String cidade;
    private String uf;

    public Endereco() {
    }

    public Endereco(Long id, String logadouro, String numero, String complemento, String cep, String cidade, String uf) {
        this.id = id;
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Logadouro não pode ser vazio!") String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(@NotBlank(message = "Logadouro não pode ser vazio!") String logadouro) {
        this.logadouro = logadouro;
    }

    public @NotBlank(message = "Numero não pode ser vazio!") String getNumero() {
        return numero;
    }

    public void setNumero(@NotBlank(message = "Numero não pode ser vazio!") String numero) {
        this.numero = numero;
    }

    public @NotBlank(message = "Complemento não pode ser vazio!") String getComplemento() {
        return complemento;
    }

    public void setComplemento(@NotBlank(message = "Complemento não pode ser vazio!") String complemento) {
        this.complemento = complemento;
    }

    public @NotBlank(message = "CEP não pode ser vazio!") String getCep() {
        return cep;
    }

    public void setCep(@NotBlank(message = "CEP não pode ser vazio!") String cep) {
        this.cep = cep;
    }

    public @NotBlank(message = " Cidade não pode ser vazio!") String getCidade() {
        return cidade;
    }

    public void setCidade(@NotBlank(message = " Cidade não pode ser vazio!") String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}