import java.util.Scanner;

public class Uni4Exe02{
  public static void main(String[] args) {
    Scanner tec = new Scanner (System.in);
   System.out.println("Digite um valor inteiro maior que 0");

    int valor = tec.nextInt();
    if (valor > 0) {
      System.out.println("O valor é positivo");
    } else {
      System.out.println("O valor é negativo");
    }


    tec.close();
}}

   