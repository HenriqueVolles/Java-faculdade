import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
         Scanner tec = new Scanner(System.in);
        System.out.println( "Digite o o comprimento");
        double comprimento = tec.nextDouble();
        System.out.println("Digite a largura");
        double largura = tec.nextDouble();
        double area = comprimento * largura;
        System.out.println("A área do terreno é " + area);
    
     

    }
 }   
     
