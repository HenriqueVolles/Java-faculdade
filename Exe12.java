import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite seu nome");
        double Nome = tec.nextDouble();
        System.out.println("Digite o numero de horas trabalhadas");
        double Horas = tec.nextDouble();
        double valorHoras = Horas * 10;
        System.out.println("Digite o número de dependentes");
        double dependentes = tec.nextDouble();
        double valorDependentes = dependentes * 60;
        double Bruto = tec.nextDouble(); 
        double salarioBruto = valorHoras + valorDependentes; 
        double INSS = tec.nextDouble();
        double descontoINSS =  (8.5 / 100) * salarioBruto;
        double  ImpRenda = tec.nextDouble();
        double impostodeRenda = (5 / 100) * salarioBruto;
        double Liquido = tec.nextDouble();
        double salarioLiquido = salarioBruto - descontoINSS - impostodeRenda;
        System.out.println("O " + Nome  + " tem o salário bruto de " + salarioBruto + " e o salário líquido de " + salarioLiquido + "reais.");

    }
}
