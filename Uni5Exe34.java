//Um hotel cobra R$ 50,00 de diária por hóspede e mais uma taxa de serviços. A taxa de serviços é de:

//R$ 7,50 por diária, caso o número de diários seja menor que 15;
//R$ 6,50 por diária, caso o número de diários seja igual a 15;
//R$ 5,00 por diária, caso o número de diários seja maior que 15.
//Descreva um algoritmo que apresenta as seguintes opções ao recepcionista:

//(1) encerrar a conta de um hóspede;
//(2) verificar o número de contas encerradas;
//(3) sair.
//Caso a opção escolhida seja a primeira, leia o nome e o número de diários do hóspede e escreva o nome e total a ser pago. Caso a opção escolhida seja a segunda, informe o número de hóspedes que deixaram o hotel (número de contas encerradas). Caso a opção escolhida seja a terceira finalizar a execução do algoritmo.

import java.util.Scanner;

public class Uni5Exe34 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        int contasEncerradas = 0;
        
        do {
            // Menu de opções
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Encerrar a conta de um hóspede");
            System.out.println("2 - Verificar número de contas encerradas");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:      
                    scanner.nextLine();
                
                    // Ler dados do hóspede
                    System.out.print("Nome do hóspede: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Número de diárias: ");
                    int diarias = scanner.nextInt();
                    
                    // Calcula o valor das diárias
                    double valorDiarias = diarias * 50.0;
                    
                    // Calcula a taxa de serviço conforme as regras
                    double taxaServico;
                    if (diarias < 15) {
                        taxaServico = diarias * 7.5;
                    } else if (diarias == 15) {
                        taxaServico = diarias * 6.5;
                    } else {
                        taxaServico = diarias * 5.0;
                    }
                    
                    // Calcula o total
                    double total = valorDiarias + taxaServico;
                    
                    // Mostra o resultado
                    System.out.println("\nResumo da conta:");
                    System.out.println("Hóspede: " + nome);
                    System.out.println("Diárias: " + diarias);
                    System.out.println("Valor das diárias: R$ " + valorDiarias);
                    System.out.println("Taxa de serviço: R$ " + taxaServico);
                    System.out.println("Total a pagar: R$ " + total);
                    
                    // Incrementa o contador de contas encerradas
                    contasEncerradas++;
                    break;
                
                case 2:
                    System.out.println("\nNúmero de contas encerradas: " + contasEncerradas);
                    break;
                
                case 3:
                    System.out.println("\nEncerrando o sistema...");
                    break;
                
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
            }
            
        } while (opcao != 3); 
        
        scanner.close();
    }
}
