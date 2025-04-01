import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a massa (kg): ");
        double massa = scanner.nextDouble();
        System.out.print("Digite a altura (m): ");
        double altura = scanner.nextDouble();
        
        scanner.close();
        
        double imc = massa / (altura * altura);
    
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 24.9) {
            classificacao = "Peso normal";
        } else if (imc < 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc < 34.9) {
            classificacao = "Obesidade grau I";
        } else if (imc < 39.9) {
            classificacao = "Obesidade grau II";
        } else {
            classificacao = "Obesidade grau III (mórbida)";
        }
        
        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + classificacao);
    }
}
    

