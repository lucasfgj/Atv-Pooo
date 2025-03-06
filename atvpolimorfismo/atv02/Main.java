package atvpolimorfismo.atv02;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println(soma.calcular(50.0, 50.0));
        System.out.println(subtracao.calcular(100.0, 50.0));
        System.out.println(multiplicacao.calcular(3.0, 5.0));
        System.out.println(divisao.calcular(500.0, 3.0));

      }
}
