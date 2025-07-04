// Faça um programa para ler os valores de dois vetores inteiros, cada um contendo 10 elementos. Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela. Faça três métodos: um método para ler valores dos vetores, outro para somar e outro para escrever os vetores.




import java.util.Scanner;

public class Uni6Exe04 {
    public static void lerVetor(int[] vetor, String nome) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor do " + nome + ": ");
            vetor[i] = scanner.nextInt();
        }
    }
    public static void somarVetores(int[] vetor1, int[] vetor2, int[] vetor3) {
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
    }
    public static void escreverVetores(int[] vetor1, int[] vetor2, int[] vetor3) {
        System.out.print("Vetor 1: ");
        for (int valor : vetor1) {
            System.out.print(valor + " ");
        }
        System.out.println();

        System.out.print("Vetor 2: ");
        for (int valor : vetor2) {
            System.out.print(valor + " ");
        }
        System.out.println();

        System.out.print("Vetor Soma: ");
        for (int valor : vetor3) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];

        lerVetor(vetor1, "vetor 1");
        lerVetor(vetor2, "vetor 2");
        somarVetores(vetor1, vetor2, vetor3);
        escreverVetores(vetor1, vetor2, vetor3);
    }
}
