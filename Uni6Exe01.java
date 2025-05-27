//Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa em que foram lidas. Faça um método para ler e outro para escrever. OBSERVAÇÃO: Não utilize o Arrays.sort

import java.util.Scanner;

public class Uni6Exe01 {

    public static void lerNumeros(int[] vetor) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
    }

    public static void escreverInverso(int[] vetor) {
        System.out.println("Números na ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }

    public static void main(String[] args) {
        int[] numeros = new int[10];

        lerNumeros(numeros);
        escreverInverso(numeros);
    }
}
