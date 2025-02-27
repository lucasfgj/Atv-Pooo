package AtvHeranca.atv02;

public class Main_atv2 {
    public static void main(String[] args) {
        Processador processador = new Processador("AMD", "Ryzen 5 5600G", "300Htz");
        Memoria memoria = new Memoria("kingston", "k260", "16Gb", "2300Htz");
        DispArmazenagem hd = new DispArmazenagem("Kingston", "KJT550", "1tera", "SATA 3");
        PlacaMae placaMae = new PlacaMae("Asus", "B450", "AM4");


        System.out.println();
        System.out.println(processador.toString());
        System.out.println();
        System.out.println(memoria.toString());
        System.out.println();
        System.out.println(hd.toString());
        System.out.println();
        System.out.println(placaMae.toString());
        System.out.println();
    }
}
