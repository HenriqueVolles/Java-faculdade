import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o cateto1");
        double cateto1 = tec.nextDouble();
        double totalCateto1 = cateto1 * cateto1;
        System.out.println("Digite o cateto2");
        double cateto2 = tec.nextDouble();
        double totalCateto2 = cateto2 * cateto2;
        double hipotenusa = totalCateto1 * totalCateto2;
        double Hipotenusa = tec.nextDouble();
        double totalHipotenusa = hipotenusa * hipotenusa;
        System.out.println("O valor da hipotenusa é " + totalHipotenusa);
    }
}
