public class Main_cliente_pet {
    public static void main(String[] args) {
        Cliente_pet cliente = new Cliente_pet("Mario", 15, new Pet_cliente("Ralph", 2, "Hotwailler"));

        System.out.println(cliente.toString());
        
    }
}
