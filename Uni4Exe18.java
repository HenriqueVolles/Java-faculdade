import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Digite o dia do vencimento: ");
        int diaVencimento = scanner.nextInt();
        
        System.out.print("Digite o dia do pagamento: ");
        int diaPagamento = scanner.nextInt();
        
        System.out.print("Digite o valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();
        
        scanner.close();
        
        double valorFinal;
       
        if (diaPagamento <= diaVencimento) {
            valorFinal = valorPrestacao * 0.90;
            System.out.println("Pagamento em dia. Desconto de 10% aplicado.");
        } else if (diaPagamento <= diaVencimento + 5) {
            valorFinal = valorPrestacao;
            System.out.println("Pagamento atrasado, mas dentro do limite de 5 dias. Sem desconto ou multa.");
        } else {
            int diasAtraso = diaPagamento - diaVencimento;
            valorFinal = valorPrestacao * (1 + (diasAtraso * 0.02));
            System.out.println("Pagamento atrasado por " + diasAtraso + " dias. Multa de 2% por dia aplicada.");
        }
        
        System.out.println("Valor final a ser pago: R$ " + valorFinal);
    }
}
