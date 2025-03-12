package Interface.Atv05;

import java.time.LocalDate;

public class Diretor extends Cargoconfianca implements Contratacao {
   
   
    public Diretor(String nome, String cpf, Genero genero, int idade, double salarioBase, LocalDate dataNascimento,
                LocalDate dataAdmissao, Bonificacao bonus) {
            super(nome, cpf, genero, idade, salarioBase, dataNascimento, dataAdmissao, bonus);
            
        }
    
    private double premio = 0.1;

   

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    @Override
    public double calcularSalarioFinal() {
        return this.salarioBase + (this.salarioBase * this.bonus.getValor()) + (this.salarioBase * this.premio);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("\n Contratou o Funcionário " + funcionario.getNome() + ". \n");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("\n Demitiu o Funcionário " + funcionario.getNome() + ". \n");
    }

    @Override
    public String toString() {
        return "Diretor \n" + super.toString() + "\n Salário final:  " + calcularSalarioFinal() + "]";
    }

    
    
}
