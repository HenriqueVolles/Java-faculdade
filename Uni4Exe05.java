
import java.util.Scanner;

public class Uni4Exe05{
  public static void main(String[] args) {
    Scanner tec = new Scanner (System.in);
   System.out.println("A cor é azul? (verdadeiro para sim e falso para não)");
   boolean resposta = tec.nextBoolean();
   if (resposta) {
     System.out.println("Sim, a cor é azul");
   } else {
     System.out.println("Não, a cor não é azul");
   }
  

 
tec.close();
}}