import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o raio");
        double valorRaio = tec.nextDouble();
        System.out.println("Digite a altura");
        double valorAltura = tec.nextDouble();
        double valorFinalRaio = valorRaio * valorRaio;
        double volumeFinal = 3.14 * valorFinalRaio * valorAltura;
        System.out.println("O volume total é " + volumeFinal);
    }
}
