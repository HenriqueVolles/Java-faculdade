import java.util.Scanner;

public class Uni4Exe10
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade de Marquinhos: ");
        int idadeMarquinhos = scanner.nextInt();

        System.out.print("Digite a idade de Zezinho: ");
        int idadeZezinho = scanner.nextInt();

        System.out.print("Digite a idade de Luluzinha: ");
        int idadeLuluzinha = scanner.nextInt();

        String cacula;

        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            cacula = "Marquinhos";
        } else if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
            cacula = "Zezinho";
        } else {
            cacula = "Luluzinha";
        }
        System.out.println("O caçula da família é " + cacula + ".");

        scanner.close();
    }
}