import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args){
         Scanner tec = new Scanner(System.in);
         System.out.println("Digite o número de frangos");
         double numeroFrangos = tec.nextDouble();
         double valorFinal = numeroFrangos * 7;
          System.out.println("o valor para marcar todos os frangos é " + valorFinal);
    }
}
