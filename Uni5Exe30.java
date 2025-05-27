//Implemente o problema da mochila. Tendo-se uma sequência decrescente de números inteiros positivos que iniciam em N, com decremento inteiro positivo K, deseja-se empacotá-los em uma mochila com tamanho M, de forma que se coloque dentro dela preferencialmente os valores maiores, até que ela fique cheia. N e K são inteiros e devem ser definidos pelo usuário. Faça um algoritmo que imprima:

//os elementos a serem colocados na mochila;
//os elementos que entraram na mochila;
//os que ficaram fora da mochila;
//qual é a soma dos elementos que entraram na mochila;
//qual a soma dos elementos que não entraram na mochila.

import java.util.Scanner;

public class Uni5Exe30 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o N: ");
		int N = teclado.nextInt();

		System.out.println("Informe o K: ");
		int K = teclado.nextInt();
		
		System.out.println("Informe quantos elementos cabem na mochila: ");
		int M = teclado.nextInt();

		String elementos = "";
		String mochilaDentro = "";
		String mochilaFora = "";
		int mochilaDentroSoma = 0;
		int mochilaForaSoma = 0;

		while (N > 0) {
			elementos += N + " ";
			if (M > 0) { 		// dentro da mochila
				mochilaDentro += N + " ";
				mochilaDentroSoma += N;
				M--;
			}
			else {
				mochilaFora += N + " ";
				mochilaForaSoma += N;
			}
			N -= K;
		}

		System.out.println("Elementos a serem colocados na mochila: " + elementos);
		System.out.println("Elementos que entraram na mochila: " + mochilaDentro);
		System.out.println("Elementos que ficaram fora da mochila: " + mochilaFora);
		System.out.println("Soma dos elementos que entraram na mochila: " + mochilaDentroSoma);
		System.out.println("Soma dos elementos que não entraram na mochila: " + mochilaForaSoma);

		teclado.close();
	}

}
