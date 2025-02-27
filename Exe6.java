import java.security.PublicKey;
import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
         System.out.println("Digite o peso do prato em quilos");
         double pesoPrato = tec.nextDouble();
         double descontoPrato = pesoPrato - 0.75;
         double descontoprato = tec.nextDouble();
         double valorFinal = descontoPrato * 25;
         System.out.println("O valor final é " + valorFinal);
    }
}
