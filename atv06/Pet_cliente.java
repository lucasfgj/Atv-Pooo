public class Pet_cliente {
    private String nome;
    private int idade;
    private String raca;

    
    public Pet_cliente() {
    }

    public Pet_cliente(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Pet_cliente [nome=" + nome + ", idade=" + idade + ", raca=" + raca + "]";
    }

    
    


}
