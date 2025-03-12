package Interface.Atv05;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        LocalDate datanascimento1 = LocalDate.of(1980, 9, 12);
        LocalDate dataadmissão1 = LocalDate.of(2024, 5, 15);
        Motoboy funcionario1 = new Motoboy("Marcos", "459.715.836-71", Genero.MASCULINO,45, 2500, datanascimento1 , dataadmissão1, "ABC-1234");


        LocalDate datanascimento2 = LocalDate.of(2000, 9, 25);
        LocalDate dataadmissão2 = LocalDate.of(2023, 5, 03);
        Gerente funcionario2 = new Gerente("Jose", "125.458.692-58", Genero.MASCULINO, 25, 3700, datanascimento2, dataadmissão2, Bonificacao.GERENTE);

        
        LocalDate datanascimento3 = LocalDate.of(2000, 9, 25);
        LocalDate dataadmissão3 = LocalDate.of(2023, 5, 03);
        Diretor funcionario3 = new Diretor("Michele", "123.475.658-68", Genero.FEMININO, 35, 6854, datanascimento3, dataadmissão3, Bonificacao.DIRETOR);


        funcionario3.admitir(funcionario1);

        System.out.println(funcionario1.toString());
        System.out.println();
        System.out.println(funcionario2.toString());
        System.out.println();
        System.out.println(funcionario3.toString());
        System.out.println();

    }
}
