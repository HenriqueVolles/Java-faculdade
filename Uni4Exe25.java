import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
        
        int opcao = scanner.nextInt();
        
        // Utilizando if-else
        ifElseOperacao(opcao, scanner);
        
        // Utilizando switch-case
        // switchOperacao(opcao, scanner);
        
        scanner.close();
    }

    public static void ifElseOperacao(int opcao, Scanner scanner) {
        if (opcao == 1) {
            System.out.print("Digite o primeiro número: ");
            double a = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double b = scanner.nextDouble();
            System.out.println("Resultado: " + (a + b));
        } else if (opcao == 2) {
            System.out.print("Digite o primeiro número: ");
            double a = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double b = scanner.nextDouble();
            System.out.println("Resultado: " + (a - b));
        } else if (opcao == 3) {
            System.out.print("Digite o primeiro número: ");
            double a = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double b = scanner.nextDouble();
            System.out.println("Resultado: " + (a * b));
        } else if (opcao == 4) {
            System.out.print("Digite o primeiro número: ");
            double a = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double b = scanner.nextDouble();
            if (b != 0) {
                System.out.println("Resultado: " + (a / b));
            } else {
                System.out.println("Erro: divisão por zero não permitida.");
            }
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public static void switchOperacao(int opcao, Scanner scanner) {
        switch (opcao) {
            case 1:
                System.out.print("Digite o primeiro número: ");
                double a = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double b = scanner.nextDouble();
                System.out.println("Resultado: " + (a + b));
                break;
            case 2:
                System.out.print("Digite o primeiro número: ");
                a = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                b = scanner.nextDouble();
                System.out.println("Resultado: " + (a - b));
                break;
            case 3:
                System.out.print("Digite o primeiro número: ");
                a = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                b = scanner.nextDouble();
                System.out.println("Resultado: " + (a * b));
                break;
            case 4:
                System.out.print("Digite o primeiro número: ");
                a = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                b = scanner.nextDouble();
                if (b != 0) {
                    System.out.println("Resultado: " + (a / b));
                } else {
                    System.out.println("Erro: divisão por zero não permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}

