import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo (n): ");
        int n = scanner.nextInt();

        int numeroAtual = 1;

        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(numeroAtual + " ");
                numeroAtual++;
            }
            System.out.println(); 
        }

        scanner.close();
    }
}