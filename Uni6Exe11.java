import java.util.Scanner;
public class Uni6Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mochila = new String[10];
        int[] pesos = new int[10];
        int pesoMaximo;
        int pesoAtual = 0;
        int itemCount = 0; /*Ate aqui ok */

        System.out.print("Informe a capacidade máxima da mochila (peso): ");
        pesoMaximo = scanner.nextInt();
        scanner.nextLine(); /*Ate aqui ok */

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir item");
            System.out.println("2. Imprimir itens da mochila");
            System.out.println("3. Valor do item mais pesado");
            System.out.println("4. Ordenar mochila");
            System.out.println("5. Excluir item");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    if (itemCount < mochila.length && pesoAtual < pesoMaximo) {
                        System.out.print("Informe o nome do item: ");
                        String item = scanner.nextLine();
                        System.out.print("Informe o peso do item: ");
                        int peso = scanner.nextInt();
                        scanner.nextLine(); 

                        if (pesoAtual + peso <= pesoMaximo) {
                            mochila[itemCount] = item;
                            pesos[itemCount] = peso;
                            pesoAtual += peso;
                            itemCount++;
                            System.out.println("Item adicionado com sucesso!");

                        } else {
                            System.out.println("A mochila está cheia ou o peso excede o máximo permitido.");
                        }
                    } else {
                        System.out.println("A mochila está cheia.");
                    }
                    break; /* ok, não pode passar do limite*/

                case 2:
                    if (itemCount == 0) {
                        System.out.println("A mochila está vazia.");
                    } else {
                        System.out.println("Itens na mochila (do último ao primeiro):"); /* usando o int I para o itemCount/ ordena do ultimo ao primeiro */
                        for (int i = itemCount - 1; i >= 0; i--) {
                            System.out.printf("%s - Peso: %d\n", mochila[i], pesos[i]);
                        }
                    }
                    break;

                case 3:
                    if (itemCount == 0) {
                        System.out.println("A mochila está vazia.");
                    } else {
                        int maxPeso = pesos[0];
                        String itemMaisPesado = mochila[0];
                        for (int i = 1; i < itemCount; i++) {
                            if (pesos[i] > maxPeso) {
                                maxPeso = pesos[i];
                                itemMaisPesado = mochila[i];
                            }
                        }
                        System.out.printf("Item mais pesado: %s - Peso: %d\n", itemMaisPesado, maxPeso); /*logica basica para diminuir e da uma ordem */
                    }
                    break; /*Ate aqui rodando */
                case 4: 
                    if (itemCount == 0) {
                        System.out.println("A mochila está vazia.");
                    } else {
                       
                        for (int i = 0; i < itemCount - 1; i++) {
                            for (int j = 0; j < itemCount - i - 1; j++) {
                                if (pesos[j] < pesos[j + 1]) {
                                
                                    int tempPeso = pesos[j];
                                    pesos[j] = pesos[j + 1];    /*Bloco de mostrar ao user, listagem ok */
                                    pesos[j + 1] = tempPeso;

                                   
                                    String tempItem = mochila[j];
                                    mochila[j] = mochila[j + 1];
                                    mochila[j + 1] = tempItem;
                                }
                            }
                        }
                        System.out.println("Mochila ordenada do mais pesado para o mais leve.");
                    }
                    break;
                case 5:
                    if (itemCount == 0) {
                        System.out.println("A mochila está vazia.");
                    } else {
                        System.out.print("Informe o nome do item a ser excluído: ");
                        String itemExcluir = scanner.nextLine();
                        boolean encontrado = false;

                        for (int i = 0; i < itemCount; i++) {
                            if (mochila[i].equalsIgnoreCase(itemExcluir)) {
                                pesoAtual -= pesos[i];
                                for (int j = i; j < itemCount - 1; j++) {
                                    mochila[j] = mochila[j + 1];                /*logica para excluir, pegando a var (Mochila) e retirando o item */
                                    pesos[j] = pesos[j + 1];
                                }
                                mochila[itemCount - 1] = null;
                                pesos[itemCount - 1] = 0;
                                itemCount--;
                                encontrado = true;
                                System.out.println("Item excluído com sucesso!");
                                break;  /*ate aqui ok */
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Item não encontrado na mochila.");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");                         
                    break;
            }
        } while (opcao != 6);
        scanner.close();    
    }
}
