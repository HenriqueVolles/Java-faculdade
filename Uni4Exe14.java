import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        
        scanner.close();
        
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        
        int diasNoMes;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasNoMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasNoMes = 30;
                break;
            case 2:
                diasNoMes = bissexto ? 29 : 28;
                break;
            default:
                diasNoMes = -1;
        }
        
        if (diasNoMes != -1 && dia >= 1 && dia <= diasNoMes) {
            System.out.println("Data válida!");
        } else {
            System.out.println("Data inválida!");
        }
    }
}

    

