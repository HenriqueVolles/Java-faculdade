import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        
        int valor1, valor2, valor3, opcaoDeOrdem;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        valor1 = s.nextInt();

        System.out.println("Informe outro valor: ");
        valor2 = s.nextInt();

        System.out.println("Informe outro valor: ");
        valor3 = s.nextInt();

        System.out.println("Informe uma opção de ordem: ");
        opcaoDeOrdem = s.nextInt();

        int menor, meio, maior;

        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
            if (valor2 < valor3) {
                meio = valor2;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor2;
            }
        } else if (valor2 < valor1 && valor2 < valor3) {
            menor = valor2;
            if (valor1 < valor3) {
                meio = valor1;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 < valor2) {
                meio = valor1;
                maior = valor2;
            } else {
                meio = valor2;
                maior = valor1;
            }
        }


        switch (opcaoDeOrdem) {
            case 1:
                System.out.println(menor + " " + meio + " " + maior);
                break;
            case 2:
                System.out.println(maior + " " + meio + " " + menor);
                break;
            case 3:
                System.out.println(meio + " " + maior + " " + menor);
            default:
                System.out.println("Opereação Inválida!");
                break;
        }
    }
}
    

