package AtvHeranca.atv02;


public class DispArmazenagem extends Empresa{
    private String capAmazenagem;
    private String tipConexao;
    
    public DispArmazenagem() {
    }

    public DispArmazenagem(String marca, String modelo, String capAmazenagem, String tipConexao) {
        super(marca, modelo);
        this.capAmazenagem = capAmazenagem;
        this.tipConexao = tipConexao;
    }

    public String getCapAmazenagem() {
        return capAmazenagem;
    }

    public void setCapAmazenagem(String capAmazenagem) {
        this.capAmazenagem = capAmazenagem;
    }

    public String getTipConexao() {
        return tipConexao;
    }

    public void setTipConexao(String tipConexao) {
        this.tipConexao = tipConexao;
    }

    @Override
    public String toString() {
        return "DispArmazenagem [marca=" + marca + ", capAmazenagem=" + capAmazenagem + ", modelo=" + modelo
                + ", tipConexao=" + tipConexao + "]";
    }
    
    
}
