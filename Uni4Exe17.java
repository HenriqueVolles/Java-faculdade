import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o rendimento anual: ");
        double rendimentoAnual = scanner.nextDouble();
        
        System.out.print("Digite o número de dependentes: ");
        int numeroDependentes = scanner.nextInt();
        
        scanner.close();

        double rendaLiquida = rendimentoAnual - (rendimentoAnual * 0.02 * numeroDependentes);
   
        double imposto;
        if (rendaLiquida <= 2000) {
            imposto = 0;
        } else if (rendaLiquida <= 5000) {
            imposto = rendaLiquida * 0.05;
        } else if (rendaLiquida <= 10000) {
            imposto = rendaLiquida * 0.10;
        } else {
            imposto = rendaLiquida * 0.15;
        }
 
        System.out.println("Renda líquida: R$ " + rendaLiquida);
        System.out.println("Imposto a ser pago: R$ " + imposto);
    }
}