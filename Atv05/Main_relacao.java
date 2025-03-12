public class Main_relacao {
        public static void main(String[] args) {
            Endereco endereco1 = new Endereco("Rua B", "45", "Salvador");
            Cliente cliente1 = new Cliente("Julia", 25, endereco1);

            System.out.println(cliente1.toString());
            
            Cliente cliente2 = new Cliente("Maria", 35, new Endereco("Rua D", "25", "Rio de Janeiro"));
            System.out.println(cliente2.toString());
    
        }
}
