public class Uni5Exe11 {
    public static void main(String[] args) {
        int horas = 16;
        long biscoitosHora = 1; 
        long totalBiscoitos = 0;

        System.out.println("Hora\tBiscoitos Quebrados");

        for (int i = 1; i <= horas; i++) {
            System.out.println(i + "\t" + biscoitosHora);
            totalBiscoitos += biscoitosHora;

            
            biscoitosHora *= 3;
        }

        System.out.println("\nTotal de biscoitos quebrados em 16 horas: " + totalBiscoitos);
    }
}