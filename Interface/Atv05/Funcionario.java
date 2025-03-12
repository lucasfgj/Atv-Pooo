package Interface.Atv05;

import java.time.LocalDate;

public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected Genero genero;
    protected int idade;
    protected double salarioBase;
    protected LocalDate dataNascimento;
    protected LocalDate dataAdmissao;

    public Funcionario(String nome, String cpf, Genero genero, int idade, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.idade = idade;
    this.salarioBase = salarioBase;
    this.dataNascimento = dataNascimento;
    this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return 
                " Nome = " + nome + 
                "\n CPF = " + cpf + 
                "\n Genero = " + genero + 
                "\n Idade = " + idade + 
                "\n SalarioBase = " + salarioBase + 
                "\n DataNascimento = " + dataNascimento + 
                "\n DataAdmissao = " + dataAdmissao + "]";
    }
    
    
}
