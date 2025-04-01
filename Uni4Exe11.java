import java.util.Scanner;

public class Uni4Exe11
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento do primeiro irmão: ");
        int ano1 = scanner.nextInt();

        System.out.print("Digite o ano de nascimento do segundo irmão: ");
        int ano2 = scanner.nextInt();

        System.out.print("Digite o ano de nascimento do terceiro irmão: ");
        int ano3 = scanner.nextInt();
        
        if (ano1 == ano2 && ano2 == ano3) {
            System.out.println("Eles são TRIGÊMEOS.");
        } else if (ano1 == ano2 || ano1 == ano3 || ano2 == ano3) {
            System.out.println("Eles são GÊMEOS.");
        } else {
            System.out.println("Eles são APENAS IRMÃOS.");
        }

        scanner.close();
    }
}