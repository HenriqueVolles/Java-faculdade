//Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia. Descreva um algoritmo que leia o limite diário (em quilogramas) e então leia o peso (em gramas) de cada peixe e envie o peso total da pesca obtida até o ponto. Quando o limite diário for excedido, escreva uma mensagem e encerre a execução do algoritmo. Para obrigação com a entrada de dados de pesos de cada peixe o algoritmo deve apresentar a seguinte mensagem: “deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”.



import java.util.Scanner;

public class Uni5Exe24 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Informe o limite de peso do dia em kg:");
    double limitePeso = teclado.nextDouble();
    
    double totalPesado = 0;
    
    while (limitePeso > totalPesado) {
		
    	System.out.println("Informe o peso do peixe em gramas:");
        double pesoPeixe = teclado.nextDouble();
        
        totalPesado += pesoPeixe / 1000;
    	
        System.out.println("O total de peixes pesados até o momento é de: " + totalPesado + "kg");
        
    	System.out.println("Deseja informar o peso de mais um peixe? (Sim/Não)");
    	String deseja = teclado.next();
    	if (deseja.equals("Não")) {
    		break;
    	}
    	
    	System.out.println("Total do dia em kg: " + totalPesado);
	}
    
    teclado.close();
  }

}
