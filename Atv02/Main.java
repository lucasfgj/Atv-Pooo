import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal[] animal1 = new Animal[2];
        int contAnimal = 1;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i< animal1.length; i++){
            
            System.out.println("Digite o nome do Animal: ");
            String nomeAnimal = sc.next();
            System.out.println("Digite a Idade do Pet: ");
            int idadeAnimal = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite a Raca do Pet: ");
            String racaAnimal = sc.next();
            System.out.println("Digite o Porte do Pet: ");
            String porteAnimal = sc.next();
            System.out.println("Digite o Alimento do Pet: ");
            String alimentoAnimal = sc.next();

            Animal animal = new Animal(nomeAnimal, idadeAnimal, racaAnimal, porteAnimal, alimentoAnimal);

            System.out.println("O nome do pet é: " + nomeAnimal);
            System.out.println("A idade do pet é: " + idadeAnimal);
            System.out.println("A raça do pet é: " + racaAnimal);
            System.out.println("O porte do pet é: " + porteAnimal);
            System.out.println("O alimento do pet é: " + alimentoAnimal);

        }
    }
}
