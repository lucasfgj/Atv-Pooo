public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private String numero;


    public Cliente(String nome, int idade, String cpf, String endereco, String numero) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.numero = numero;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }
}
