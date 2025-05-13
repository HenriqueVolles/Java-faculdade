import java.util.Scanner;

public class Uni6Exe02 {
    public static void lerValores(double[] vetor) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }
    }
    public static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double valor : vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }
    public static void mostrarMaioresQueMedia(double[] vetor, double media) {
        System.out.println("Valores maiores que a média (" + media + "):");
        for (double valor : vetor) {
            if (valor > media) {
                System.out.println(valor);
            }
        }
    }
    public static void main(String[] args) {
        double[] valores = new double[12];

        lerValores(valores);
        double media = calcularMedia(valores);
        mostrarMaioresQueMedia(valores, media);
    }
}