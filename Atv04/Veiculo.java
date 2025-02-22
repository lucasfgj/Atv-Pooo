public class Veiculo {
    private String placaCarro;
    private String corCarro;
    private int numPassageiro;
    private int capTanqCarro;
    private int velMaxCarro;
    private int consMedCarro;

    
    public Veiculo(String placaCarro, String corCarro, int numPassageiro, int capTanqCarro, int velMaxCarro,
            int consMedCarro) {
        this.placaCarro = placaCarro;
        this.corCarro = corCarro;
        this.numPassageiro = numPassageiro;
        this.capTanqCarro = capTanqCarro;
        this.velMaxCarro = velMaxCarro;
        this.consMedCarro = consMedCarro;
    }


    public String getPlacaCarro() {
        return placaCarro;
    }


    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }


    public String getCorCarro() {
        return corCarro;
    }


    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }


    public int getNumPassageiro() {
        return numPassageiro;
    }


    public void setNumPassageiro(int numPassageiro) {
        this.numPassageiro = numPassageiro;
    }


    public int getCapTanqCarro() {
        return capTanqCarro;
    }


    public void setCapTanqCarro(int capTanqCarro) {
        this.capTanqCarro = capTanqCarro;
    }


    public int getVelMaxCarro() {
        return velMaxCarro;
    }


    public void setVelMaxCarro(int velMaxCarro) {
        this.velMaxCarro = velMaxCarro;
    }


    public int getConsMedCarro() {
        return consMedCarro;
    }


    public void setConsMedCarro(int consMedCarro) {
        this.consMedCarro = consMedCarro;
    }
}
