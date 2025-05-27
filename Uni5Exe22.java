//Um funcionário recebe aumento anual. Em 1995 foi contratado por 2.000 reais. Em 1996 recebeu um aumento de 1,5%. A partir de 1997, os aumentos sempre exigem ao dobro do ano anterior. Faça um programa que determine o salário atual do funcionário.

import java.util.Scanner;

public class Uni5Exe22 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe até que ano deve ser calculado:");
    int anoLimite = teclado.nextInt();

    int ano = 1995;
    double salario = 2000;
    double percentualAumento = 1.5;
    double valorAumento = (salario * percentualAumento) / 100;
    
    while (ano < anoLimite) {
    	salario +=  valorAumento;
    	valorAumento = valorAumento * 2;
    	ano++;
	  }
    
    System.out.println("O salário atual é de: R$ " + salario);
    
    teclado.close();
  }

}
