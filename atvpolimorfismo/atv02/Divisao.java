package atvpolimorfismo.atv02;

public class Divisao implements OperadorMatematica {

    @Override
    public Double calcular(Double a, Double b) {
        return a / b;
    }

}
