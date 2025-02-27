package AtvHeranca.atv02;

public class Processador extends Empresa {
        
    private String  frequencia;

    public Processador() {
    }

    public Processador(String marca, String modelo, String frequencia) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador [marca=" + marca + ", frequencia=" + frequencia + ", modelo=" + modelo + "]";
    }

    
   
}