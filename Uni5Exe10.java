public class Uni5Exe10 {
    public static void main(String[] args) {
        int encontrados = 0;
        int numero = 1;

        System.out.println("Os 10 primeiros números com a propriedade especial são:");

        while (encontrados < 10) {
            int numeroStrLen = String.valueOf(numero).length();

           
            for (int i = 1; i < numeroStrLen; i++) {
               
                int potencia = (int) Math.pow(10, i);
                int parteEsquerda = numero / potencia;
                int parteDireita = numero % potencia;

                if (parteDireita == 0) {
                    continue; 
                }

                int soma = parteEsquerda + parteDireita;
                if (soma * soma == numero) {
                    System.out.println(numero);
                    encontrados++;
                    break;
                }
            }

            numero++;
        }
    }
}