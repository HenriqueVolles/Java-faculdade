import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o valor do litro da gasolina");
        double preçoGasolina = tec.nextDouble();
        System.out.println("Digite o valor final pago");
        double valorFinal = tec.nextDouble();
        double quantidadeLitros = valorFinal / preçoGasolina;
    
        System.out.println("A quantidade total de litros é " + quantidadeLitros);
    }
}
