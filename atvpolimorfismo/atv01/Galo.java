package atvpolimorfismo.atv01;

public class Galo implements Animal{

    @Override
    public String emitirSom() {
        return "COCORICOOOOOO!!";
    }

    @Override
    public String comer() {
        return "Comendo!!!";
    }
    
}
