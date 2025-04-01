import java.util.Scanner;

public class Uni4Exe12 {
    public static String classificarTriangulo(double lado1, double lado2, double lado3) {
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            if (lado1 == lado2 && lado2 == lado3) {
                return "Triângulo Equilátero";
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                return "Triângulo Isósceles";
            } else {
                return "Triângulo Escaleno";
            }
        } else {
            return "Os valores fornecidos não formam um triângulo";
        }
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o primeiro lado: ");
        double lado1 = tec.nextDouble();
        System.out.print("Digite o segundo lado: ");
        double lado2 = tec.nextDouble();
        System.out.print("Digite o terceiro lado: ");
        double lado3 = tec.nextDouble();
        tec.close();

        String resultado = classificarTriangulo(lado1, lado2, lado3);
        System.out.println(resultado);
    }
}
