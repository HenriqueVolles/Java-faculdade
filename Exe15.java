import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite um valor com 3 digitos");
        int valor = tec.nextInt();
        int centena = valor / 100;
        int dezena = (valor % 100) / 10;
        int unidade = valor % 10;
        System.out.println("as centenas são " + centena + " ,as dezenas são " + dezena + " e as unidades são " + unidade);
        

    }
}
