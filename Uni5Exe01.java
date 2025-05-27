//Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo for par ou ímpar.


import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = scanner.nextInt();

  
            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é PAR.");
            } else {
                System.out.println("O número " + numero + " é ÍMPAR.");
            }
        }

        scanner.close();
    }
}
