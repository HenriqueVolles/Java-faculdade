//Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a sua massa inicial em Kg, descreva um algoritmo que determina o tempo necessário para que essa massa se torne menor que 0,5 gramas. Escreva a massa inicial, a massa final e o tempo.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe20 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0000000000");

    double massaInicial = 0;
    System.out.print("Informe a massa inicial em Kg: ");
    massaInicial = teclado.nextDouble();
    double massa = massaInicial * 1000; // kilos para gramas

    double tempo = 0;
    while (massa > 0.5) {
      massa /= 2;
      tempo += 50;
    }

    System.out.println("  massa inicial (kg): " + massaInicial);
    System.out.println("  massa final (kg): " + df.format((massa / 1000))); // gramas para kilos
    System.out.println("  tempo (segundos): " + tempo);

    teclado.close();
  }

}
