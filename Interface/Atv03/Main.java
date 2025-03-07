public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Gato gato = new Gato();
        Pato pato = new Pato();
        Galo galo = new Galo();

        System.out.println(gato.emitirSom());
        System.out.println(gato.comer());
        System.out.println(cachorro1.comer());
        System.out.println(galo.emitirSom());
        System.out.println(galo.comer());
        System.out.println(cachorro1.comer());
        System.out.println(pato.emitirSom());
        System.out.println(pato.comer());
    }
}