import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCompra = 0, totalVenda = 0, lucroTotal = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Mercadoria " + i + ":");

            System.out.print("Digite o nome da mercadoria: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço de compra (PC) da mercadoria: ");
            double pc = scanner.nextDouble();

            System.out.print("Digite o preço de venda (PV) da mercadoria: ");
            double pv = scanner.nextDouble();
            scanner.nextLine(); 

            double lucroPercentual = ((pv - pc) / pc) * 100;

            if (lucroPercentual < 10) {
                System.out.println("Lucro da mercadoria " + nome + " é menor que 10%");
            } else if (lucroPercentual <= 20) {
                System.out.println("Lucro da mercadoria " + nome + " está entre 10% e 20%");
            } else {
                System.out.println("Lucro da mercadoria " + nome + " é maior que 20%");
            }

            totalCompra += pc;
            totalVenda += pv;
            lucroTotal += (pv - pc);
        }

        System.out.println("\nTotal de compra de todas as mercadorias: R$ " + totalCompra);
        System.out.println("Total de venda de todas as mercadorias: R$ " + totalVenda);
        System.out.println("Lucro total de todas as mercadorias: R$ " + lucroTotal);

        scanner.close();
    }
}
