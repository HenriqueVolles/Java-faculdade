import java.util.Scanner;

public class Uni4Exep2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a letra correspondente à cor do sinal (V, A ou E): ");
        char cor = scanner.next().toUpperCase().charAt(0);

        if (cor == 'V') {
            System.out.println("Verde (siga)");
        } else if (cor == 'A') {
            System.out.println("Amarelo (atenção)");
        } else if (cor == 'E') {
            System.out.println("Vermelho (pare)");
        } else {
            System.out.println("Entrada Incorreta");
        }

        scanner.close();
    }
}