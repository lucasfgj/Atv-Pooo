public class Main {
    public static void main(String[] args) {
        
        Veiculo veiculo = new Veiculo("JDK1015", "Vermelho", 4, 50, 350, 13);

        System.out.println("A placa do Veiculo " + veiculo.getPlacaCarro());
        System.out.println("A cor do veiculo " + veiculo.getCorCarro());
        System.out.println("A numero de passageiros é " + veiculo.getNumPassageiro());
        System.out.println("A capacidade do tanque é " + veiculo.getCapTanqCarro());
        System.out.println("A velocidade maxima é " + veiculo.getVelMaxCarro());
        System.out.println("O consumo medio do veiculo é:" + veiculo.getConsMedCarro());


        Livro livro = new Livro("O curtiço", "Jose de alencar", 12578, 180, 25.0);
        
        System.out.println("Nome do livro: " + livro.getTitulo());
        System.out.println("O autor: " + livro.getAutor());
        System.out.println("O ISBN: " + livro.getIsbn());
        System.out.println("O numero de paginas: " + livro.getNumPaginas());
        System.out.println("O valor do livro: " + livro.getPreco());
    }
}
