import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o valor em dolares");
        double valorDolares = tec.nextDouble();
        double valorReais = valorDolares * 6.65;
        System.out.println("O valor a ser entregado em reais é " + valorReais);
    }

}
