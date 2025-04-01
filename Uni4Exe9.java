import java.util.Scanner;

public class Uni4Exe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("Os números " + num1 + " e " + num2 + " são múltiplos.");
        } else {
            System.out.println("Os números " + num1 + " e " + num2 + " não são múltiplos.");
        }

        scanner.close();
    }
}