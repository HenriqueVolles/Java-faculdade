//Em uma disputa de pingue-pongue os pontos são anotados como D , ponto para o jogador do lado direito, e E , ponto para o jogador do lado esquerdo da mesa. Descreva um algoritmo que leia o código do ponto de cada jogo e determine o vencedor. A partida encerra quando:

um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores para maior ou igual a dois;
o jogador com mais de 21 pontos consegue uma diferença de dois pontos sobre o oponente, caso a primeira condição não seja atendida.

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pontosD = 0; 
        int pontosE = 0; 
        String ponto;
        boolean fimJogo = false;
        
        System.out.println("Digite 'D' para ponto do jogador da direita e 'E' para ponto do jogador da esquerda");
                
        while (!fimJogo) {
            System.out.print("Informe quem marcou o ponto (D/E): ");
            ponto = scanner.next().toUpperCase();
        
            switch (ponto) {
                case "D":
                    pontosD++;    
                    break;
                case "E":
                    pontosE++;
                    break;
                default:
                    System.out.println("Entrada inválida! Use apenas 'D' ou 'E'.");
                    break;
            }
                       
            System.out.println("Placar: Jogador D " + pontosD + " x " + pontosE + " Jogador E");
            
            // Verifica condições de fim de jogo
            if ((pontosD >= 21 || pontosE >= 21) && Math.abs(pontosD - pontosE) >= 2) {
                fimJogo = true;
            }

        }
        
        // Determina o vencedor
        if (pontosD > pontosE) {
            System.out.println("O jogador da direita (D) venceu!");
        } else {
            System.out.println("O jogador da esquerda (E) venceu!");
        }
        
        System.out.println("Placar final: Jogador D " + pontosD + " x " + pontosE + " Jogador E");
        
        scanner.close();
    }
}
