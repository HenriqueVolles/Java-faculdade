import java.util.Scanner;

public class Uni4Exe03 {
  public static void main(String[] args) {
    Scanner tec = new Scanner (System.in);
    System.out.println("digite o primeiro numero inteiro");   
    int num1 = tec.nextInt();
    System.out.println("digite o segundo numero inteiro"); 
    int num2 = tec.nextInt();

   if (num1 > num2) {
    System.out.println("O maior numero é " + num1);
   } else {
    System.out.println("O maior numero é " + num2);
   }
    if (num1 == num2) {
    System.out.println("Os numeros são iguais");
   }
  



tec.close();
}}