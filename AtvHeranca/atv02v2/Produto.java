package AtvHeranca.atv02v2;

public abstract class Produto {
    protected String marca;
    protected String modelo;
    protected Double frequencia;
    protected Double capArmaz;
    
  

    public Produto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Produto(String marca, String modelo, Double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public Produto(String marca, Double capArmaz, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.capArmaz = capArmaz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Double frequencia) {
        this.frequencia = frequencia;
    }

    public Double getCapArmaz() {
        return capArmaz;
    }

    public void setCapArmaz(Double capArmaz) {
        this.capArmaz = capArmaz;
    }

   
    public String toStringTudoJunto() {
        return "Produto [marca=" + marca + ", modelo=" + modelo + ", frequencia=" + frequencia + ", capArmaz=" + capArmaz + "]";
    }

    public String toStringCapArmaz() {
        return "Produto [marca=" + marca + ", modelo=" + modelo + ", capArmaz=" + capArmaz + "]";
    }

    
    public String toStringFrequencia() {
        return "Produto [marca=" + marca + ", modelo=" + modelo + ", frequencia=" + frequencia + "]";
    }

    
}
