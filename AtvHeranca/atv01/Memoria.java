package AtvHeranca.atv01;

public class Memoria extends Empresa {

    private String capArmazenagem;

    public Memoria() {
    }

    public Memoria(String marca, String modelo, String capArmazenagem) {
        super(marca, modelo);
        this.capArmazenagem = capArmazenagem;
    }

    public String getCapArmazenagem() {
        return capArmazenagem;
    }

    public void setCapArmazenagem(String capArmazenagem) {
        this.capArmazenagem = capArmazenagem;
    }

    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", capArmazenagem=" + capArmazenagem + ", modelo=" + modelo + "]";
    }
    
    
    
}
