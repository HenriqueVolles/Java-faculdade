import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o altura");
        double altura = tec.nextDouble();
        System.out.println("Digite o comprimento");
        double comprimento = tec.nextDouble();
        double Area = altura * comprimento;
        double numeroAzulejos = Area * 9;
        double valorFinal = numeroAzulejos * 12.50;
        System.out.println("O valor final será de " + valorFinal + "reais");
  }
    }

