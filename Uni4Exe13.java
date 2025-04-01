
import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Obtendo as três cartas do usuário
        System.out.print("Digite a primeira carta: ");
        int carta1 = scanner.nextInt();
        System.out.print("Digite a segunda carta: ");
        int carta2 = scanner.nextInt();
        System.out.print("Digite a terceira carta: ");
        int carta3 = scanner.nextInt();
        
        scanner.close();

        int contadorBoas = 0;
        
        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            contadorBoas++;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            contadorBoas++;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            contadorBoas++;
        }
        
        if (contadorBoas == 1) {
            System.out.println("TRUCO");
        } else if (contadorBoas == 2) {
            System.out.println("SEIS");
        } else if (contadorBoas == 3) {
            System.out.println("NOVE");
        }
    }
}


