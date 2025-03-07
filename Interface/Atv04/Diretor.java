public class Diretor extends Funcionario {
    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    public double getPREMIO(){
        return PREMIO;
    };
    
    @Override
    public double getSalarioFinal(){
        double resultado = 0;
        resultado = super.salarioBase;
        resultado += super.salarioBase * this.PREMIO;
        return resultado;
    }
    
}
