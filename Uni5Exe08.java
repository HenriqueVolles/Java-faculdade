import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = scanner.nextInt();

        int menorNegativo = 0;
        boolean existeNegativo = false;

        int somaPositivos = 0;
        int contPositivos = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                if (!existeNegativo || numero < menorNegativo) {
                    menorNegativo = numero;
                    existeNegativo = true;
                }
            } else if (numero > 0) {
                somaPositivos += numero;
                contPositivos++;
            }
        }

        if (existeNegativo) {
            System.out.println("Menor número negativo: " + menorNegativo);
        } else {
            System.out.println("Nenhum número negativo foi informado.");
        }

        if (contPositivos > 0) {
            double media = (double) somaPositivos / contPositivos;
            System.out.printf("Média dos números positivos: %.2f\n", media);
        } else {
            System.out.println("Nenhum número positivo foi informado.");
        }

        scanner.close();
    }
}