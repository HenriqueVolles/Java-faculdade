import java.util.Scanner;

public class Uni4Exe06{
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println ("digite um caractere");
        char caractere = tec.next().charAt(0);

        switch (caractere) {
            case 'M':
            System.out.println("Masculino");
            break;
            case 'F':
            System.out.println ("Feminino");
            break;
            case 'I':
            System.out.println ("Não informado");
            break;
            default:
            System.out.println ("Entrada incorreta");
        

        tec.close();
    }
}
}