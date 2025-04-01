import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println( "Digite qual é o valor do sapato");
        double valor = tec.nextDouble();
        double desconto = valor * 0.12;
        System.out.println("O desconto será de " + desconto + "reais");
        double preçoFinal = valor - desconto;
        System.out.println("O valor final será de " + preçoFinal + "reais");
    }
    
}
