import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Digite a hora de chegada: ");
        int horaChegada = scanner.nextInt();
        System.out.print("Digite os minutos de chegada: ");
        int minutoChegada = scanner.nextInt();

       
        System.out.print("Digite a hora de partida: ");
        int horaPartida = scanner.nextInt();
        System.out.print("Digite os minutos de partida: ");
        int minutoPartida = scanner.nextInt();

        if (horaChegada < 0 || horaChegada > 23 || minutoChegada < 0 || minutoChegada > 59 ||
            horaPartida < 0 || horaPartida > 23 || minutoPartida < 0 || minutoPartida > 59 ||
            (horaPartida < horaChegada) || (horaChegada == horaPartida && minutoPartida < minutoChegada)) {
            System.out.println("Erro: Horário inválido.");
        } else {
         
            int totalMinutosChegada = horaChegada * 60 + minutoChegada;
            int totalMinutosPartida = horaPartida * 60 + minutoPartida;
            int tempoEstacionado = totalMinutosPartida - totalMinutosChegada;

            
            int horasCobradas = tempoEstacionado / 60;  
            int minutosRestantes = tempoEstacionado % 60; 

            if (minutosRestantes > 29) { 
                horasCobradas++;
            } else if (tempoEstacionado > 0 && horasCobradas == 0) {
                horasCobradas = 1; 
            }

            double valorPagar = 0;
            switch (horasCobradas) {
                case 1:
                case 2:
                    valorPagar = horasCobradas * 5.00;
                    break;
                case 3:
                case 4:
                    valorPagar = 2 * 5.00 + (horasCobradas - 2) * 7.50;
                    break;
                default:
                    valorPagar = 2 * 5.00 + 2 * 7.50 + (horasCobradas - 4) * 10.00;
                    break;
            }

            System.out.println("Tempo estacionado: " + horasCobradas + " hora(s).");
            System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);
        }

        scanner.close();
    }
}