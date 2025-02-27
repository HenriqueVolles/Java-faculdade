import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args){
         Scanner tec = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius");
        double Celsius = tec.nextDouble();
        double Fahrenheit = Celsius * 1.8 + 32;
        System.out.println("A temperatura é de " + Fahrenheit + "F");

    }
}
