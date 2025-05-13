import java.util.Scanner;

public class Uni6Exe05 {

    public static void lerRespostas(String[] respostas, String pessoa) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Responda com: SIM, NÃO ou IND");
        for (int i = 0; i < respostas.length; i++) {
            System.out.print(pessoa + " - Pergunta " + (i + 1) + ": ");
            respostas[i] = scanner.next().toUpperCase();
           
            while (!respostas[i].equals("SIM") && !respostas[i].equals("NÃO") && !respostas[i].equals("IND")) {
                System.out.print("Resposta inválida. Digite SIM, NÃO ou IND: ");
                respostas[i] = scanner.next().toUpperCase();
            }
        }
    }
    public static int calcularAfinidade(String[] rapaz, String[] moça) {
        int afinidade = 0;

        for (int i = 0; i < rapaz.length; i++) {
            if (rapaz[i].equals(moça[i])) {
                afinidade += 3;
            } else if (rapaz[i].equals("IND") || moça[i].equals("IND")) {
                afinidade += 1;
            } else if ((rapaz[i].equals("SIM") && moça[i].equals("NÃO")) || 
                       (rapaz[i].equals("NÃO") && moça[i].equals("SIM"))) {
                afinidade -= 2;
            }
        }

        return afinidade;
    }
    public static void mostrarMensagem(int afinidade) {
        System.out.println("Índice de afinidade: " + afinidade);
        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Vale um encontro.");
        } else if (afinidade >= -9 && afinidade <= -1) {
            System.out.println("Melhor não perder tempo");
        } else if (afinidade == -10) {
            System.out.println("Vocês se odeiam!");
        }
    }

    public static void main(String[] args) {
        String[] rapaz = new String[5];
        String[] moca = new String[5];

        System.out.println("Respostas do rapaz:");
        lerRespostas(rapaz, "Rapaz");

        System.out.println("\nRespostas da moça:");
        lerRespostas(moca, "Moça");

        int afinidade = calcularAfinidade(rapaz, moca);
        System.out.println();
        mostrarMensagem(afinidade);
    }
}