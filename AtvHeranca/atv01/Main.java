package AtvHeranca.atv01;

public class Main {
    public static void main(String[] args) {
       Processador processador = new Processador("AMD", "5600G", "3");
       Memoria memoria = new Memoria("Asrock", "Vikens", "16GB");

       System.out.println();
       System.out.println(processador.toString());
       System.out.println();   
       System.out.println(memoria.toString());
       System.out.println();
    }

}
