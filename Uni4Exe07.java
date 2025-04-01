import java.util.Scanner;

public class Uni4Exe07{
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println ("digite o peso da carta em gramas");
        int peso = tec.nextInt();
        
        double custo = 0.45;

        if (peso > 50) {
            int pesoExcedente = peso - 50;
            int adicionais = pesoExcedente / 20;
            custo += adicionais * 0.45;
        }
        System.out.println ("custo por carta: R$" + custo);
        



        tec.close ();
    }
}
