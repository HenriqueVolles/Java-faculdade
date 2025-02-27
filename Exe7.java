import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o numero de latinhas");
        double numeroLatas = tec.nextDouble();
        double totalLatas = numeroLatas * 0.35;
        System.out.println("Digite o numero de garrafinhas");
        double numeroGarrafinhas = tec.nextDouble();
        double totalGarrafinhas = numeroGarrafinhas * 0.60;
        System.out.println("Digite o numero de garrafas grandes");
        double numeroGarrafasGrandes = tec.nextDouble();
        double totalGarrafasGrandes = numeroGarrafasGrandes * 2;
        double valorTotal = tec.nextDouble();
        double valorFinal = totalLatas + totalGarrafinhas + totalGarrafasGrandes;
        System.out.println("O valor final é de " + valorFinal);
    }
}
