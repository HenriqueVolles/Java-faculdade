import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Digite a coordenada X: ");
        int x = scanner.nextInt();
        System.out.print("Digite a coordenada Y: ");
        int y = scanner.nextInt();
        
        scanner.close();
      
        int quadrante;
        if (x == 0 && y == 0) {
            quadrante = 0;
        } else if (x > 0 && y > 0) {
            quadrante = 1;
        } else if (x < 0 && y > 0) {
            quadrante = 2;
        } else if (x < 0 && y < 0) {
            quadrante = 3;
        } else {
            quadrante = 4;
        }
        
        System.out.println("O ponto está no quadrante: " + quadrante);
    }
}