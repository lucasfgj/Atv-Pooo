public class Main {
    public static void main(String[] args) {
        Funcionario motoboy = new Motoboy("Alison", "25/06/98", Sexo.MASCULINO, Setor.OPERACOES, 2500, "ba3950078");
        Funcionario diretor = new Diretor("Jucelino Kubishek", "15/02/65", Sexo.MASCULINO, Setor.OPERACOES, 5600);
        
        
        System.out.println();
        System.out.println(motoboy.toString());
        System.out.println();
        System.out.println(diretor.toString());

        
       
    }
}
