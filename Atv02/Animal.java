public class Animal {
    private String nomePet;
    private int Idade;
    private String raca;
    private String porte;
    private String Alimento;
    
    
    public Animal(String nomePet, int idade, String raca, String porte, String alimento) {
        this.nomePet = nomePet;
        this.Idade = idade;
        this.raca = raca;
        this.porte = porte;
        this.Alimento = alimento;
    }


    public String getNomePet() {
        return nomePet;
    }


    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }


    public int getIdade() {
        return Idade;
    }


    public void setIdade(int idade) {
        Idade = idade;
    }


    public String getRaca() {
        return raca;
    }


    public void setRaca(String raca) {
        this.raca = raca;
    }


    public String getPorte() {
        return porte;
    }


    public void setPorte(String porte) {
        this.porte = porte;
    }


    public String getAlimento() {
        return Alimento;
    }


    public void setAlimento(String alimento) {
        Alimento = alimento;
    }

}
