public class Main {
    public static void main(String[] args) {
        
            Veiculo veiculo = new Veiculo("tjs2015", "Rosa", 2, 20, 160, 40);
    
            System.out.println("A placa do Veiculo " + veiculo.getPlacaCarro());
            System.out.println("A cor do veiculo " + veiculo.getCorCarro());
            System.out.println("A numero de passageiros é " + veiculo.getNumPassageiro());
            System.out.println("A capacidade do tanque é " + veiculo.getCapTanqCarro());
            System.out.println("A velocidade maxima é " + veiculo.getVelMaxCarro());
            System.out.println("O consumo medio do veiculo é:" + veiculo.getConsMedCarro());
    
            
    }
}
