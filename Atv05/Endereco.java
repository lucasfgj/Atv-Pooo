public class Endereco {
    private  String logadouro;
    private String numero;
    private String cidade;


    public Endereco(String logadouro, String numero, String cidade) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.cidade = cidade;
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
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    @Override
    public String toString() {
        return "Endereco [logadouro=" + logadouro + ", numero=" + numero + ", cidade=" + cidade + "]";
    }

    
    
    
    
    
    
}
