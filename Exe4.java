import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args){
         Scanner tec = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        double primeiraNota = tec.nextDouble();
        double primeiraNotaCerta = primeiraNota * 0.5;
        System.out.println("Digite a segunda nota");
        double segundaNota = tec.nextDouble();
        double segundaNotaCerta = segundaNota * 0.3;
        System.out.println("Digite a terceira nota");
        double terceiraNota = tec.nextDouble();
        double terceiraNotaCerta = terceiraNota * 0.2;
        double mediaFinal = primeiraNotaCerta + segundaNotaCerta + terceiraNotaCerta;
        System.out.println(" A média final é " + mediaFinal);
    }
}
