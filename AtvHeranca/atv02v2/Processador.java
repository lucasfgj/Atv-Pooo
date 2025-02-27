package AtvHeranca.atv02v2;

public class Processador extends Produto{

    public Processador(String marca, String modelo, Double frequencia) {
        super(marca, modelo, frequencia);
        
    }

    @Override
    public String toString() {
        return "Processador []" + toStringFrequencia();
    }
    
}
