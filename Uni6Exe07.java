//Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo inteiro. Em seguida, solicite ao usuário que digite um número inteiro várias vezes, até preencher o vetor. Esse número deverá ser armazenado no vetor caso ainda não exista, e se o valor já existir deve ser pedido um novo valor. Isto é, se o usuário informar o número 2 e já existir o número 2 em alguma posição do vetor, o número não deve ser adicionado. Após ter adicionado todos os números dentro do vetor, o mesmo deve ser ordenado. Para isso reordene os elementos internos do vetor de modo que este fique em ordem crescente, conforme no exemplo: OBSERVAÇÃO: Não utilize o Arrays.sort

//Origem do vetor: [0][4][2][6][3]
//Vetor ordenado: [0][2][3][4][6]
//Crie um método para inserir os valores no vetor, outro para ordenar o vetor e outro para informar o vetor resultante. Para "método ordenar" você pode usar o "método bolha


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
