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