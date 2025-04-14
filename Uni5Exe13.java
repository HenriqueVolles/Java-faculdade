import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de reabastecimentos: ");
        int numReabastecimentos = scanner.nextInt();

        double odometroAnterior = 0;
        double distanciaTotal = 0;
        double combustivelTotal = 0;

        for (int i = 1; i <= numReabastecimentos; i++) {
            System.out.print("Digite o valor do odômetro após o " + i + "º reabastecimento: ");
            double odometroAtual = scanner.nextDouble();

            System.out.print("Digite a quantidade de combustível (em litros) comprada no " + i + "º reabastecimento: ");
            double combustivel = scanner.nextDouble();

            if (i > 1) {
                double distanciaPercorrida = odometroAtual - odometroAnterior;
                double quilometragemPorLitro = distanciaPercorrida / combustivel;

                System.out.println("Quilometragem obtida por litro na " + i + "ª parada: " + quilometragemPorLitro + " km/l");

                distanciaTotal += distanciaPercorrida;
                combustivelTotal += combustivel;
            }

            odometroAnterior = odometroAtual;
        }

        if (combustivelTotal > 0) {
            double quilometragemMedia = distanciaTotal / combustivelTotal;
            System.out.println("A quilometragem média obtida por litro em toda a viagem: " + quilometragemMedia + " km/l");
        } else {
            System.out.println("Não há dados suficientes para calcular a quilometragem média.");
        }

        scanner.close();
    }
}