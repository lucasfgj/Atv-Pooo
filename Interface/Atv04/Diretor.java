public class Diretor extends Funcionario implements Contratacao {
    private final double PREMIO = 1.2;

    
    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    public double getPREMIO(){
        return PREMIO;
    }
    
    @Override
    public double getSalarioFinal(){
        return super.getSalarioBase() * PREMIO;
    };

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionário: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionário: " + funcionario.toString());
    }
}


