//Astolfo resolveu fazer uma viagem para conhecer o nosso país. Ele pretende visitar várias cidades, dividindo assim a viagem em vários trechos. Entretanto Astolfo se nega a passar por estradas cujo custo do pedágio excede um determinado valor. Faça um programa que leia inicialmente o valor do pedágio ao qual Astolfo se nega a pagar. A seguir leia várias duplas de valores representando respectivamente o custo do pedágio e a distância (em Km) do trecho. Calcular e escrever:

//quantos trechos da viagem possuem um valor de pedágio acima do qual Astolfo negase a pagar;
//quantos trechos foram informados;
//quantos trechos acima de 150Km de distância possuem um valor de pedágio que Astolfo concorda em pagar.
//OBS: O programa será encerrado ao ser fornecido um valor de pedágio negativo. Neste caso a leitura da distância não deve ser realizada. Os resultados devem ser impressos no final do programa.

import java.util.Scanner;

public class Uni5Exe26 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Valor máximo de pedágio: ");
		final double pedagioMaximo = teclado.nextDouble(); 
		
		System.out.println("   Pedágio    Distância");
		
		double pedagioCusto = 0;
		int pedagioDistancia = 0;
		int pedagioQtdNega = 0;
		int pedagioQtdTrechos = 0;
		int pedagioQtdPaga150 = 0;

		System.out.println("Custo: ");
		pedagioCusto = teclado.nextDouble();
		while (pedagioCusto >= 0) {
			System.out.println("Distância: ");
			pedagioDistancia = teclado.nextInt(); 

			if (pedagioCusto > pedagioMaximo) { //a
				pedagioQtdNega++;
			}
			pedagioQtdTrechos++; //b
			if (pedagioDistancia > 150) { //c
				if (pedagioCusto <= pedagioMaximo) {
					pedagioQtdPaga150++;
				}
			}
			System.out.println("Custo: ");
			pedagioCusto = teclado.nextDouble();
		}
		System.out.println(pedagioQtdNega+" (trechos com valor acima do qual ele nega-se a pagar)");
		System.out.println(pedagioQtdTrechos+" (quantidade de trechos informados)");
		System.out.println(pedagioQtdPaga150+" (trechos acima de 150km com valor aceito por ele)"); 
		teclado.close();
	}
}
