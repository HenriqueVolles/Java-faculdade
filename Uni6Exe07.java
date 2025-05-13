import java.util.Scanner;

public class Uni6Exe07 {

    public static boolean existeValor(int[] vetor, int tamanhoAtual, int valor) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }
    public static int inserirValores(int[] vetor, int n) {
        Scanner scanner = new Scanner(System.in);
        int inseridos = 0;

        while (inseridos < n) {
            System.out.print("Digite o " + (inseridos + 1) + "º valor inteiro: ");
            int valor = scanner.nextInt();

            if (!existeValor(vetor, inseridos, valor)) {
                vetor[inseridos] = valor;
                inseridos++;
            } else {
                System.out.println("Valor já existe no vetor! Digite outro valor.");
            }
        }

        return inseridos;
    }

    public static void ordenarVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void exibirVetor(int[] vetor, int tamanho) {
        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite o tamanho do vetor (máximo 20): ");
            n = scanner.nextInt();
        } while (n <= 0 || n > 20);

        int[] vetor = new int[n];

        int totalInseridos = inserirValores(vetor, n);

        ordenarVetor(vetor, totalInseridos);

        exibirVetor(vetor, totalInseridos);
    }
}