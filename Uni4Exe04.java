import java.util.Scanner;

public class Uni4Exe04 {
  public static void main(String[] args) {
    Scanner tec = new Scanner (System.in);
   System.out.println("digite um numero maior que 0");
   double numero = tec.nextDouble();
   if (numero > 0) {
      if (numero == (int)numero) {
        System.out.println("O numero digitado não possui casas decimais");
      } else {
        System.out.println("O numero digitado possui casas decimais");
      }
         } else   { 
        System.out.println ("o numero deve ser maior que 0");
        
    
      
   }





 
tec.close();
}
}