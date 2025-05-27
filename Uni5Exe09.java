//Uma turma tem em alunos. Dado n , o nome e idade de cada aluno descreva um algoritmo que:
//escreva os nomes dos alunos que têm 18 anos;
//escreva a quantidade de alunos que têm idade acima de 20 anos.


import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        int contAcimaDe20 = 0;

        System.out.println("Alunos com 18 anos:");
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o nome do " + i + "º aluno: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

            if (idade == 18) {
                System.out.println("- " + nome);
            }

            if (idade > 20) {
                contAcimaDe20++;
            }
        }

        System.out.println("Quantidade de alunos com mais de 20 anos: " + contAcimaDe20);

        scanner.close();
    }
}
