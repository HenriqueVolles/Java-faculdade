import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você deseja inserir? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Quantidade inválida. O número deve ser maior que zero.");
            return;
        }

        double numero;
        double maior = 0;
        double menor = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextDouble();

            if (i == 1) {
            
                maior = numero;
                menor = numero;
            } else {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        scanner.close();
    }
}