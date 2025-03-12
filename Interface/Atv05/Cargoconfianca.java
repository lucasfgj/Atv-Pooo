package Interface.Atv05;

import java.time.LocalDate;

public abstract class Cargoconfianca extends Funcionario {
        protected Bonificacao bonus;

        public Cargoconfianca(String nome, String cpf, Genero genero, int idade, double salarioBase,
                LocalDate dataNascimento, LocalDate dataAdmissao, Bonificacao bonus) {
            super(nome, cpf, genero, idade, salarioBase, dataNascimento, dataAdmissao);
            this.bonus = bonus;
        }

        public Bonificacao getBonus() {
            return bonus;
        }

        public void setBonus(Bonificacao bonus) {
            this.bonus = bonus;
        }


   


}
