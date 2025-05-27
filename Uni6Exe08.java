// Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo real. Faça o usuário informar valores para as posições deste vetor e coloque-as nas posições na sequência informada pelo usuário. Imprima uma tabela contendo cada valor diferente e o número de vezes que o valor aparece no vetor (veja exemplo a seguir).


import java.util.Scanner;

public class Uni6Exe08 {

    public static void lerVetor(double[] vetor, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor real: ");
            vetor[i] = scanner.nextDouble();
        }
    }

    public static boolean jaContado(double[] vetor, int pos, double valor) {
        for (int i = 0; i < pos; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static void exibirContagem(double[] vetor, int n) {
        System.out.println("\nVALOR\tOCORRÊNCIAS");

        for (int i = 0; i < n; i++) {
            if (!jaContado(vetor, i, vetor[i])) {
                int contagem = 1;
                for (int j = i + 1; j < n; j++) {
                    if (vetor[j] == vetor[i]) {
                        contagem++;
                    }
                }
                System.out.printf("%.2f\t%d\n", vetor[i], contagem);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite o tamanho do vetor (até 20): ");
            n = scanner.nextInt();
        } while (n <= 0 || n > 20);

        double[] vetor = new double[n];

        lerVetor(vetor, n);
        exibirContagem(vetor, n);
    }
}
