public class Main_banco {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("234", "Armando", "Rua das Pitangas", "8672-8922", "armandodelas@hotmail.com", 
        new Conta_banco("Bradesco", "54", "Corrente", "R$ 250", "R$ 500"));

        System.out.println(funcionario.toString());
    }
}
