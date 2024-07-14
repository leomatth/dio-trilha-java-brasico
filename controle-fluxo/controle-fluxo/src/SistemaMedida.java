import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sigla (P, M ou G): ");
        String sigla = scanner.next().toUpperCase(); // Converte para maiúsculas para ser case insensitive

        // Verifica se a sigla é válida e imprime o tamanho correspondente
        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MÉDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("INDEFINIDO");
                break;
        }

        scanner.close();
    }
}
