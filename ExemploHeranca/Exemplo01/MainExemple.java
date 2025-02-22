package ExemploHeranca.Exemplo01;

public class MainExemple {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marta", 25, "11/12/23", "PIX");
        Funcionario funcionario = new Funcionario("jose", 45, "AVC123", "Programador", 5600);

        System.out.println();
        System.out.println(cliente1.toString());
        System.out.println();
        System.out.println(funcionario.toString());
        System.out.println();
        
    }
}   
