//Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.

import java.util.Scanner;

public class Uni5Exe21 {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);

    double alturaChico = 1.50;
    double crescimentoChico = 0.02;
    
    double alturaZe = 1.10;
    double crescimentoZe = 0.03;
    
    int ano = 2024;
    
    while (alturaChico > alturaZe) {
		alturaChico += crescimentoChico;
		alturaZe += crescimentoZe;
    	ano++;
	}
    
    System.out.println("Zé será maior que chico no ano de: " + ano);
    System.out.println("Zé precisará de " + (ano - 2024) + " anos para ser maior que o chico");
    
    
    tec.close();
  }

}
