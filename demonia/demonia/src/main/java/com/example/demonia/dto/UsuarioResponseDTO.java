package com.example.demonia.dto;

public class UsuarioResponseDTO {
    private String nome;
    private String eamil;

    public UsuarioResponseDTO() {
    }

    public UsuarioResponseDTO(String nome, String eamil) {
        this.nome = nome;
        this.eamil = eamil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }
}
