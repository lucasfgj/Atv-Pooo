public class Funcionario {
    private String codFuncionario;
    private String nome;
    private String endereco;
    private String telefone;
    private String Email;
    private Conta_banco bancoCliente;
    
    public Funcionario() {
    }

    public Funcionario(String codFuncionario, String nome, String endereco, String telefone, String email,
            Conta_banco bancoCliente) {
        this.codFuncionario = codFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        Email = email;
        this.bancoCliente = bancoCliente;
    }

    public String getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(String codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Conta_banco getBancoCliente() {
        return bancoCliente;
    }

    public void setBancoCliente(Conta_banco bancoCliente) {
        this.bancoCliente = bancoCliente;
    }

    @Override
    public String toString() {
        return "Funcionario [codFuncionario=" + codFuncionario + ", nome=" + nome + ", endereco=" + endereco
                + ", telefone=" + telefone + ", Email=" + Email + ", bancoCliente=" + bancoCliente + "]";
    }
    
    
}
