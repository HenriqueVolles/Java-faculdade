import java.util.Scanner;

public class Exep1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a quantidade de itens produzidos nos últimos três meses:");
        System.out.print("Mês 1: ");
        int mes1 = scanner.nextInt();
        System.out.print("Mês 2: ");
        int mes2 = scanner.nextInt();
        System.out.print("Mês 3: ");
        int mes3 = scanner.nextInt();


        System.out.println("\nMenu:");
        System.out.println("a) Maior quantidade de itens produzidos");
        System.out.println("b) Menor quantidade de itens produzidos");
        System.out.println("c) Quantidades ordenadas do menor para o maior");
        System.out.println("d) Média da produção nos três meses");
        System.out.print("Escolha uma opção: ");

        char opcao = scanner.next().toLowerCase().charAt(0); 

        switch (opcao) {
            case 'a': 
                int maior = (mes1 > mes2 && mes1 > mes3) ? mes1 : (mes2 > mes3 ? mes2 : mes3);
                System.out.println("Maior quantidade produzida: " + maior);
                break;
            
            case 'b': 
                int menor = (mes1 < mes2 && mes1 < mes3) ? mes1 : (mes2 < mes3 ? mes2 : mes3);
                System.out.println("Menor quantidade produzida: " + menor);
                break;
            
            case 'c': 
                int primeiro, segundo, terceiro;
                if (mes1 <= mes2 && mes1 <= mes3) {
                    primeiro = mes1;
                    if (mes2 <= mes3) {
                        segundo = mes2;
                        terceiro = mes3;
                    } else {
                        segundo = mes3;
                        terceiro = mes2;
                    }
                } else if (mes2 <= mes1 && mes2 <= mes3) {
                    primeiro = mes2;
                    if (mes1 <= mes3) {
                        segundo = mes1;
                        terceiro = mes3;
                    } else {
                        segundo = mes3;
                        terceiro = mes1;
                    }
                } else {
                    primeiro = mes3;
                    if (mes1 <= mes2) {
                        segundo = mes1;
                        terceiro = mes2;
                    } else {
                        segundo = mes2;
                        terceiro = mes1;
                    }
                }

                System.out.println("Quantidades ordenadas: " + primeiro + ", " + segundo + ", " + terceiro);
                break;
            
            case 'd': 
                double media = (mes1 + mes2 + mes3) / 3.0;
                System.out.printf("Média da produção: %.2f%n", media);
                break;
            
            default: 
                System.out.println("Opção inválida! Escolha entre a, b, c ou d.");
        }

        scanner.close();
    }
}