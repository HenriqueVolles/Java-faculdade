//O número 3025 possui a seguinte característica:
//\normalsize&space;30+25=55\rightarrow55^2=3025
//Escreva um programa que pesquise e imprima os 10 primeiros números naturais que apresentam tal propriedade.

public class Uni5Exe10 {
    public static void main(String[] args) {
        int encontrados = 0;
        int numero = 1;

        System.out.println("Os 10 primeiros números com a propriedade especial são:");

        while (encontrados < 10) {
            int numeroStrLen = String.valueOf(numero).length();

           
            for (int i = 1; i < numeroStrLen; i++) {
               
                int potencia = (int) Math.pow(10, i);
                int parteEsquerda = numero / potencia;
                int parteDireita = numero % potencia;

                if (parteDireita == 0) {
                    continue; 
                }

                int soma = parteEsquerda + parteDireita;
                if (soma * soma == numero) {
                    System.out.println(numero);
                    encontrados++;
                    break;
                }
            }

            numero++;
        }
    }
}
