//Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.


import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaAlturas = 0.0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a altura da " + i + "ª pessoa (em metros): ");
            double altura = scanner.nextDouble();
            somaAlturas += altura;
        }

        double mediaAltura = somaAlturas / 20.0;

        System.out.printf("A média de altura das 20 pessoas é: %.2f metros\n", mediaAltura);

        scanner.close();
    }
}
