public class Motoboy extends Funcionario {
    private String cnh;

    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String cnh) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "Motoboy [nome=" + nome + ", cnh=" + cnh + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo
                + ", setor=" + setor + ", salarioBase=" + salarioBase + "]";
    }
    
    @Override
    public double getSalarioFinal(){
        return super.salarioBase;
    };

}
