package Interface.Atv05;

import java.time.LocalDate;

public class Gerente extends Cargoconfianca {

   

    public Gerente(String nome, String cpf, Genero genero, int idade, double salarioBase, LocalDate dataNascimento,
                LocalDate dataAdmissao, Bonificacao bonus) {
            super(nome, cpf, genero, idade, salarioBase, dataNascimento, dataAdmissao, bonus);
           
        }
    
        
        @Override
        public double calcularSalarioFinal() {
            return this.salarioBase + (this.salarioBase * this.bonus.getValor());
        }
        
        @Override
        public String toString() {
            return "Gerente \n" + super.toString() +  "\n Salário final:  " + calcularSalarioFinal() + "]";
        }
}
