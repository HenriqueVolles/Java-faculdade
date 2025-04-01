import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("T - Área de um Triângulo.");
        System.out.println("Q - Área de um Quadrado.");
        System.out.println("R - Área de um Retângulo.");
        System.out.println("C - Área de um Círculo.");
        System.out.print("Digite a opção desejada: ");
        
        char opcao = scanner.next().toUpperCase().charAt(0); 

        if (opcao == 'T' || opcao == 'Q' || opcao == 'R' || opcao == 'C') {
            double area = 0;
 
            switch (opcao) {
                case 'T':
                    System.out.print("Digite a base do triângulo: ");
                    double baseT = scanner.nextDouble();
                    System.out.print("Digite a altura do triângulo: ");
                    double alturaT = scanner.nextDouble();
                    area = (baseT * alturaT) / 2;
                    System.out.println("Área do Triângulo: " + area);
                    break;
                case 'Q':
                    System.out.print("Digite o lado do quadrado: ");
                    double ladoQ = scanner.nextDouble();
                    area = ladoQ * ladoQ;
                    System.out.println("Área do Quadrado: " + area);
                    break;
                case 'R':
                    System.out.print("Digite a base do retângulo: ");
                    double baseR = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double alturaR = scanner.nextDouble();
                    area = baseR * alturaR;
                    System.out.println("Área do Retângulo: " + area);
                    break;
                case 'C':
                    System.out.print("Digite o raio do círculo: ");
                    double raioC = scanner.nextDouble();
                    area = Math.PI * Math.pow(raioC, 2);
                    System.out.println("Área do Círculo: " + area);
                    break;
            }
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}