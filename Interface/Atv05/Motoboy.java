package Interface.Atv05;

import java.time.LocalDate;

public class Motoboy extends Funcionario  {
    private String placaDaMoto;

    public Motoboy(String nome, String cpf, Genero genero, int idade, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao, String placaDaMoto) {
        super(nome, cpf, genero, idade, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double calcularSalarioFinal() {
        return this.salarioBase;
    }

    @Override
    public String toString() {
        return  
         "Motoboy \n" + super.toString() + "\n placaDaMoto= " + placaDaMoto +  "\n Salario Final: " + calcularSalarioFinal() + "]";
    }

    
    

}
