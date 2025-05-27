//Foi feita uma pesquisa de audiência de canal de TV em casas de um determinado bairro de uma cidade, em um certo dia do mês. Na pesquisa foi utilizado um coletor de dados portátil. Para cada casa visitada, foi fornecido o número do canal (4, 5, 9, 12) e o número de pessoas que assistiram à TV naquele horário, considerando que em cada casa só existia uma televisão. Nas casas onde a televisão estava desligada, foi registrado zero para o número do canal e para o número de pessoas. Baseado nisto descreva um algoritmo que calcula e escreve, para cada emissora, o percentual de audiência. A leitura deve ser finalizada quando for informado o canal 0.

import java.util.Scanner;

public class Uni5Exe18 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int canal = 99;
    int qtdPessoas = 0;
    int qtdPessoasSoma = 0;
    int qtdPessoasCanal4 = 0;
    int qtdPessoasCanal5 = 0;
    int qtdPessoasCanal9 = 0;
    int qtdPessoasCanal12 = 0;

    while (canal != 0) {
      System.out.println("Informe o canal: ");
      canal = teclado.nextInt();
      if (canal != 0) {
        System.out.println("Informe o qtd pessoas: ");
        qtdPessoas = teclado.nextInt();
        qtdPessoasSoma += qtdPessoas;        
      }

      switch (canal) {
        case 4:
          qtdPessoasCanal4 += qtdPessoas;
          break;
        case 5:
          qtdPessoasCanal5 += qtdPessoas;
          break;
        case 9:
          qtdPessoasCanal9 += qtdPessoas;
          break;
        case 12:
          qtdPessoasCanal12 += qtdPessoas;
          break;
        case 0:
          // fim pesquisa //
          break;
        default:
          System.out.println(" número do canal ERRADO.");
          break;
      }
    }
    System.out.println(" _ Percentual de Audiência _ ");
    System.out.println(" Canal  4: " + (qtdPessoasCanal4 * 100) / (double) qtdPessoasSoma);
    System.out.println(" Canal  5: " + (qtdPessoasCanal5 * 100) / (double) qtdPessoasSoma);
    System.out.println(" Canal  9: " + (qtdPessoasCanal9 * 100) / (double) qtdPessoasSoma);
    System.out.println(" Canal 12: " + (qtdPessoasCanal12 * 100) / (double) qtdPessoasSoma);

    teclado.close();
  }
}
