public class Conta_banco {
    private String banco;
    private String agencia;
    private String tipCont;
    private String saldoAtual;
    private String limiteDisponivel;
    
    public Conta_banco() {
    }

    public Conta_banco(String banco, String agencia, String tipCont, String saldoAtual, String limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.tipCont = tipCont;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTipCont() {
        return tipCont;
    }

    public void setTipCont(String tipCont) {
        this.tipCont = tipCont;
    }

    public String getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(String saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public String getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(String limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "Conta_banco [banco=" + banco + ", agencia=" + agencia + ", tipCont=" + tipCont + ", saldoAtual="
                + saldoAtual + ", limiteDisponivel=" + limiteDisponivel + "]";
    }

    
}
