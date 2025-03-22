package com.javaspring.aula.model;

import com.javaspring.aula.model.Usuario;
import jakarta.persistence.*;

@Entity
@Table(name = "tab_funcionario")
public class Funcionario{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String matricula;
    private String Setor;

    public Funcionario(Long id, String nome, String email, String matricula, String setor) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        Setor = setor;
    }

    public Funcionario() {
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSetor() {
        return Setor;
    }

    public void setSetor(String setor) {
        Setor = setor;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", matricula='" + matricula + '\'' +
                ", Setor='" + Setor + '\'' +
                '}';
    }
}
