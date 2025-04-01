import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Digite a quantidade de meses desde a admissão: ");
        int mesesAdmissao = scanner.nextInt();
        
        scanner.close();
 
        double reajuste;
        if (mesesAdmissao <= 12) {
            reajuste = 5.0;
        } else if (mesesAdmissao <= 48) {
            reajuste = 7.0;
        } else {
            reajuste = 0.0;
        }
        
        if (reajuste > 0) {
            System.out.println("O funcionário terá um reajuste de " + reajuste + "% no salário.");
        } else {
            System.out.println("O funcionário não tem direito a reajuste.");
        }
    }
}