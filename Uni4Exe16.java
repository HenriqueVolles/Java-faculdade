import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Digite a idade do primeiro homem: ");
        int homem1 = scanner.nextInt();
        System.out.print("Digite a idade do segundo homem: ");
        int homem2 = scanner.nextInt();
        System.out.print("Digite a idade da primeira mulher: ");
        int mulher1 = scanner.nextInt();
        System.out.print("Digite a idade da segunda mulher: ");
        int mulher2 = scanner.nextInt();
        
        scanner.close();
        
        int homemMaisVelho = Math.max(homem1, homem2);
        int homemMaisNovo = Math.min(homem1, homem2);
       
        int mulherMaisVelha = Math.max(mulher1, mulher2);
        int mulherMaisNova = Math.min(mulher1, mulher2);
    
        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;
     
        System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + soma);
        System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produto);
    }
}