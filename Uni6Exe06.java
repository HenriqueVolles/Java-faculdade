import java.util.Scanner;

public class Uni6Exe06 {

    public static void lerVetor(double[] vetor) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = scanner.nextDouble();
        }
    }
    public static boolean valorExiste(double[] vetor, double valor) {
        for (double v : vetor) {
            if (v == valor) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores (N): ");
        int n = scanner.nextInt();

        double[] valores = new double[n];
        lerVetor(valores);

        System.out.print("Digite um valor real para buscar no vetor: ");
        double valorBusca = scanner.nextDouble();

        if (valorExiste(valores, valorBusca)) {
            System.out.println("O valor " + valorBusca + " está no vetor.");
        } else {
            System.out.println("O valor " + valorBusca + " NÃO está no vetor.");
        }
    }
}