import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro[] livro1 = new Livro[2];
        int contLivro = 1;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i< livro1.length; i++){

        System.out.println("DIgite o nome do Livro desejado: ");
        String tituloLivro = sc.nextLine();
        System.out.println("Digite o nome do Autor do livro: ");
        String autorLivro = sc.nextLine();
        System.out.println("Digite o numero de paginas do livro");
        int numPagina = sc.nextInt();
        System.out.println("Digite o Preço do Livro");
        Double precoLivro = sc.nextDouble();
        sc.nextLine();

        Livro livro = new Livro(tituloLivro, autorLivro, i, numPagina, precoLivro);
        
        System.out.println("O livro é " + livro.getTitulo());
        System.out.println("O autor do Livro é: " + livro.getAutor());
        System.out.println("O Livro tem " + livro.getNumPaginas() + " paginas");
        System.out.println("O preço do Livro " + livro.getTitulo() + " : " + livro.getPreco());
    
        }
    }
}
