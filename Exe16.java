import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o valor da compra");
        int valorCompra = tec.nextInt();
        System.out.println("Digite o valor pago");
        int valorPago = tec.nextInt();
        int troco = valorPago - valorCompra;
        int centena = troco / 100;
        int dezena = (troco % 100) / 10;
        int unidade = troco % 10;
        System.out.println("As centenas serão " + centena + ", as dezenas serão " + dezena + " e as unidades serão " + unidade);


    }
}
