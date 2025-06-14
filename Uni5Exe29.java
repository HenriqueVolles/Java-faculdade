//Uma caixa automática possui cédulas de 1, 2, 5, 10 e 20. Faça um programa que leia um valor e informe a quantidade mínima de cédulas que ele precisará combinar para entregar o valor solicitado. Por exemplo: se o valor for 6, então ele fornecerá uma cédula de 5 e outra de 1. Se o número for 47, então ele fornecerá duas cédulas de 20, uma de 5 e outras de 2.



import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o valor a ser sacado: ");
        int valorSaque = scanner.nextInt();
                
        // Declara variáveis para contar cada tipo de cédula
        int cedulas20 = 0;
        int cedulas10 = 0;
        int cedulas5 = 0;
        int cedulas2 = 0;
        int cedulas1 = 0;
        
        // Valor restante a ser sacado
        int valorRestante = valorSaque;
        
        // Usando while para processar as cédulas
        while (valorRestante > 0) {
            if (valorRestante >= 20) {
                cedulas20++;
                valorRestante -= 20;
            } else if (valorRestante >= 10) {
                cedulas10++;
                valorRestante -= 10;
            } else if (valorRestante >= 5) {
                cedulas5++;
                valorRestante -= 5;
            } else if (valorRestante >= 2) {
                cedulas2++;
                valorRestante -= 2;
            } else {
                cedulas1++;
                valorRestante -= 1;
            }
        }
        
        // Exibe o resultado
        System.out.println("Para sacar R$ " + valorSaque + ", serão necessárias:");
        System.out.println(cedulas20 + " cédula(s) de R$ 20");
        System.out.println(cedulas10 + " cédula(s) de R$ 10");
        System.out.println(cedulas5 + " cédula(s) de R$ 5");
        System.out.println(cedulas2 + " cédula(s) de R$ 2");
        System.out.println(cedulas1 + " cédula(s) de R$ 1");
        
        scanner.close();
    }
}
