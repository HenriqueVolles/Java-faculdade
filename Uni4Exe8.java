import java.util.Scanner;

public class Uni4Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().toLowerCase().charAt(0); 

        if (letra >= 'a' && letra <= 'z') {
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("A letra '" + letra + "' é uma vogal.");
                    break;
                default:
                    System.out.println("A letra '" + letra + "' não é uma vogal.");
            }
        } else {
            System.out.println("Entrada inválida! Por favor, digite uma letra do alfabeto.");
        }

        scanner.close(); 
    }
}