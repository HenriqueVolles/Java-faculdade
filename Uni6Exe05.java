//Com o objetivo de determinar o índice de profundidade entre um rapaz e uma moça cada um respondeu um questionário com 5 perguntas, como por exemplo:

//Gosta de música sertaneja?
//Gosta de futebol?
//Gosta de seriados?
//Gosta de redes sociais?
//Gosta da Oktoberfest?
//A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice de espessura é medido da seguinte maneira:

//se ambos deram a mesma resposta soma-se 3 pontos ao índice;
//se um respondeu IND e o outro SIM ou NÃO soma-se 1;
//se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
//Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as respostas da moça. Crie um método que possa ler tanto as respostas do rapaz como da moça, e outro para calcular e retornar a espessura. Por fim, escreva a resenha considerando os seguintes acontecimentos:


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
