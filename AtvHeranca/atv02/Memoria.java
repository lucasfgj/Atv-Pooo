package AtvHeranca.atv02;

public class Memoria extends Empresa{
    private String capArmazenagem;
    private String frequencia;
    
    public Memoria() {
    }

    public Memoria(String marca, String modelo, String capArmazenagem, String frequencia) {
        super(marca, modelo);
        this.capArmazenagem = capArmazenagem;
        this.frequencia = frequencia;
    }

    public String getCapArmazenagem() {
        return capArmazenagem;
    }

    public void setCapArmazenagem(String capArmazenagem) {
        this.capArmazenagem = capArmazenagem;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Memoria [capArmazenagem=" + capArmazenagem + ", marca=" + marca + ", frequencia=" + frequencia
                + ", modelo=" + modelo + "]";
    }
    
    
    
}
