import java.util.Scanner;

public class Livro {
     private String titulo;
    private String autor;
    private int NumPaginas;
    private Double preco;


    Scanner sc = new Scanner(System.in);

    public Livro(String titulo, String autor, int numPaginas, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.NumPaginas = numPaginas;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        NumPaginas = numPaginas;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

}
