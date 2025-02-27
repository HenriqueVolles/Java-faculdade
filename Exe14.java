import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args){
         Scanner tec = new Scanner(System.in);
    System.out.println("Digite a distância");
    double distância = tec.nextDouble();
    System.out.println("Digite o tempo");
    double tempo  = tec.nextDouble();
    double velocidadeMedia = distância / tempo; 
    double litrosGastos = distância / 12;
    System.out.println("A velocidade média foi de " + velocidadeMedia + " km/h e o consumo medio foi de " + litrosGastos );
       
    }
}
