import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Escreva o número de 1 a 3, que esta em seu portal do aluno");
        int cursoAtual = tec.nextInt();
         
        tec.close();

        switch (cursoAtual) {
            case 1:
              System.out.println("Bacharelado em ciências da computação");
              break;
            
            case 2:
              System.out.println("Licenciado em computação");
              break;

            case 3:
              System.out.println("Bacharel em Sistemas de Informação");
              break;

            default:
              System.out.println("Sem formações validas");

        
        }
         }
    }