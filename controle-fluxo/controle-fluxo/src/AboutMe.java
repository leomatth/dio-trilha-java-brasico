import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
           //criando objeto scarnner entrada de dados pelo usuário, é um padrão importar e dps criar
            // Try e catch - vão servir para exceções, caso o usuário resolva escrever de forma errad

        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("    Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("    Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("    Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("    Digite sua Altura: ");
        double altura = scanner.nextDouble();

        
        // imprimindo os dados obtidos pelo usuário: 

        System.out.println("    Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("    Tenho " + idade + " anos e meço " + altura + " centímetros." );
        
        } catch (InputMismatchException e) {
            System.out.println(" Os campos de Nome e Sobrenome devem ser escritos somente com Letras, idade deve ser um número inteiro e altura deve ser separada por ponto ex'1.59' ");
        }

    }
}
