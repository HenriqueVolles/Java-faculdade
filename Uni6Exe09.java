import java.util.Scanner;

public class Uni6Exe09 {

    static final int TOTAL_PESSOAS = 30;

    public static void lerDados(int[] sexo, int[] nota, int[] idade) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < TOTAL_PESSOAS; i++) {
            System.out.println("\nPessoa " + (i + 1) + ":");

            do {
                System.out.print("Sexo (1=feminino, 2=masculino): ");
                sexo[i] = scanner.nextInt();
            } while (sexo[i] != 1 && sexo[i] != 2);

            do {
                System.out.print("Nota (0 a 10): ");
                nota[i] = scanner.nextInt();
            } while (nota[i] < 0 || nota[i] > 10);

            do {
                System.out.print("Idade: ");
                idade[i] = scanner.nextInt();
            } while (idade[i] <= 0);
        }
    }
    public static double calcularMediaGeral(int[] nota) {
        int soma = 0;
        for (int n : nota) {
            soma += n;
        }
        return (double) soma / TOTAL_PESSOAS;
    }

    public static double mediaHomens(int[] sexo, int[] nota) {
        int soma = 0;
        int qtd = 0;
        for (int i = 0; i < TOTAL_PESSOAS; i++) {
            if (sexo[i] == 2) {
                soma += nota[i];
                qtd++;
            }
        }
        return qtd > 0 ? (double) soma / qtd : 0;
    }

    public static int notaMulherMaisJovem(int[] sexo, int[] nota, int[] idade) {
        int menorIdade = Integer.MAX_VALUE;
        int notaMaisJovem = -1;

        for (int i = 0; i < TOTAL_PESSOAS; i++) {
            if (sexo[i] == 1 && idade[i] < menorIdade) {
                menorIdade = idade[i];
                notaMaisJovem = nota[i];
            }
        }
        return notaMaisJovem;
    }

    public static int mulheresAcima50NotaAlta(int[] sexo, int[] nota, int[] idade, double mediaGeral) {
        int cont = 0;
        for (int i = 0; i < TOTAL_PESSOAS; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaGeral) {
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {
        int[] sexo = new int[TOTAL_PESSOAS];
        int[] nota = new int[TOTAL_PESSOAS];
        int[] idade = new int[TOTAL_PESSOAS];

        lerDados(sexo, nota, idade);

        double mediaGeral = calcularMediaGeral(nota);
        double mediaHomens = mediaHomens(sexo, nota);
        int notaMaisJovem = notaMulherMaisJovem(sexo, nota, idade);
        int mulheresAcima50 = mulheresAcima50NotaAlta(sexo, nota, idade, mediaGeral);

        System.out.printf("\nNota média geral: %.2f\n", mediaGeral);
        System.out.printf("Nota média dos homens: %.2f\n", mediaHomens);
        System.out.printf("Nota da mulher mais jovem: %d\n", notaMaisJovem);
        System.out.printf("Mulheres com mais de 50 anos que deram nota acima da média: %d\n", mulheresAcima50);
    }
}

