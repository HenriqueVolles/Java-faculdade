//Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% e os valores das posições pares sejam aumentados em 2%. Imprima o vetor resultante. Faça um método para ler os valores, outro para ajustar os valores dentro do vetor e outro para escrever os valores atualizados do vetor.


import java.util.Scanner;

public class Uni6Exe03 {

    public static void lerValores(double[] vetor) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }
    }

    public static void ajustarValores(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) { 
                vetor[i] = vetor[i] * 1.02;
            } else {          
                vetor[i] = vetor[i] * 1.05;
            }
        }
    }
    public static void escreverValores(double[] vetor) {
        System.out.println("Vetor atualizado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d: %.2f%n", i, vetor[i]);
        }
    }
    public static void main(String[] args) {
        double[] valores = new double[12];

        lerValores(valores);
        ajustarValores(valores);
        escreverValores(valores);
    }
}
