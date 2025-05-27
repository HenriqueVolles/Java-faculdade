//Uma loja de departamentos oferece aos seus clientes um determinado desconto de acordo com o valor da compra efetuada. O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual. Descreva um algoritmo que leia o valor da compra e escreva o total a pagar a cada compra. Informe também o valor total recebido pela loja ao final do dia. A leitura deve ser finalizada com a leitura 0 para o valor da compra.

import java.util.Scanner;

public class Uni5Exe19 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double valorCampra;
    double valorComDesconto;
    double valorComDescontoSoma = 0;

    System.out.println("Informe o valor da compra: ");
    valorCampra = teclado.nextDouble();
    while (valorCampra != 0) {
      if (valorCampra > 500) {  // 20% desconto
        valorComDesconto = valorCampra - (valorCampra * 0.20);
      } else {                  // 15% desconto
        valorComDesconto = valorCampra - (valorCampra * 0.15);
      }
      System.out.println("  total a pagar: " + valorComDesconto);
      valorComDescontoSoma += valorComDesconto;

      System.out.println("Informe o valor da compra: ");
      valorCampra = teclado.nextDouble();
    }
    System.out.println(" total recebido: " + valorComDescontoSoma);
    teclado.close();
  }

}
