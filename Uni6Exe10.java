import java.util.Scanner;

public class Uni6Exe10 {

    static final int MAX_SIZE = 50; 
    static int[] vetor = new int[MAX_SIZE];
    static int tamanhoAtual = 0; 

    public static void incluirValor() {
        if (tamanhoAtual < MAX_SIZE) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor a ser incluído: ");
            int valor = scanner.nextInt();
            vetor[tamanhoAtual] = valor;
            tamanhoAtual++;
            System.out.println("Valor incluído com sucesso!");
        } else {
            System.out.println("Vetor cheio. Não é possível incluir mais valores.");
        }
    }

    public static void pesquisarValor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a ser pesquisado: ");
        int valor = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < tamanhoAtual; i++) {
            if (vetor[i] == valor) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Valor encontrado no vetor.");
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

    public static void alterarValor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a ser alterado: ");
        int valorAntigo = scanner.nextInt();
        System.out.print("Digite o novo valor: ");
        int novoValor = scanner.nextInt();

        boolean alterado = false;
        for (int i = 0; i < tamanhoAtual; i++) {
            if (vetor[i] == valorAntigo) {
                vetor[i] = novoValor;
                alterado = true;
                break;
            }
        }

        if (alterado) {
            System.out.println("Valor alterado com sucesso.");
        } else {
            System.out.println("Número não encontrado.");
        }
    }

    public static void excluirValor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a ser excluído: ");
        int valor = scanner.nextInt();

        boolean excluido = false;
        for (int i = 0; i < tamanhoAtual; i++) {
            if (vetor[i] == valor) {
                for (int j = i; j < tamanhoAtual - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }
                tamanhoAtual--;
                excluido = true;
                break;
            }
        }

        if (excluido) {
            System.out.println("Valor excluído com sucesso.");
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

    public static void mostrarValores() {
        if (tamanhoAtual == 0) {
            System.out.println("Vetor vazio.");
            return;
        }

        System.out.print("Valores no vetor: ");
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void ordenarValores() {
        for (int i = 0; i < tamanhoAtual - 1; i++) {
            for (int j = 0; j < tamanhoAtual - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        System.out.println("Valores ordenados.");
    }

    public static void inverterValores() {
        int inicio = 0;
        int fim = tamanhoAtual - 1;
        while (inicio < fim) {
            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;
            inicio++;
            fim--;
        }
        System.out.println("Valores invertidos.");
    }

    public static void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 – Incluir valor");
            System.out.println("2 – Pesquisar valor");
            System.out.println("3 – Alterar valor");
            System.out.println("4 – Excluir valor");
            System.out.println("5 – Mostrar valores");
            System.out.println("6 – Ordenar valores");
            System.out.println("7 – Inverter valores");
            System.out.println("8 – Sair do sistema");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    incluirValor();
                    break;
                case 2:
                    pesquisarValor();
                    break;
                case 3:
                    alterarValor();
                    break;
                case 4:
                    excluirValor();
                    break;
                case 5:
                    mostrarValores();
                    break;
                case 6:
                    ordenarValores();
                    break;
                case 7:
                    inverterValores();
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 8);
    }

    public static void main(String[] args) {
        exibirMenu();
    }
}