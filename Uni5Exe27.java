//Uma fábrica resolveu, no mês de abril, pagar aos seus funcionários um valor diário conforme as regras descritas abaixo. Escreva um programa para ler o dia do mês de abril que calculará o valor diário. O programa deve validar a leitura do dia deforma a aceitar apenas valores válidos para o mês de abril (1 a 30). Caso o dia seja inválido, escreva a mensagem "Dia inválido" e repita a leitura até que seja válido. A seguir deve ser lido o total de peças produzidas pelo funcionário no turno da manhã e o total de peças produzidas no turno da tarde. Escrever o valor que o respectivo funcionário receberá no dia. Logo após exibir a mensagem "Novo funcionário (1.sim 2.não)?". Caso a resposta seja 1 o programa deve ser repetido solicitando novamente o dia do mês e a produção de peças do funcionário em cada turno, caso contrário deve ser encerrado.

//Regras:
//para a primeira quinzena do mês (1 a 15) o funcionário recebe R$ 0,80 por peça caso tenha produzido mais de 100 no dia (considerando manhã e tarde), desde que a produção em cada um dos turnos não seja inferior a 30. Caso contrário recebe R$ 0,50 por peça.
//para a segunda quinzena do mês (16 a 30) o proprietário recebe R$ 0,40 por peça produzida no turno da manhã e R$ 0,30 por peça produzida no turno da tarde.
//Considere que a produção em cada turno nunca será a mesma (não é necessário validar) Responda também:

//qual dia ocorreu a maior produção;
//em qual período o funcionário mais produz (manhã ou tarde e a quantidade produzida).

import java.util.Scanner;

public class Uni5Exe27 {
   public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    int novoFuncionario = 1;
    int totalPecasDia = 0;
    double valorRecebido = 0;
    int diaMaiorProducao = 0, pecasMaiorProducao = 0;
    String periodoMaiorProducao = ""; 

    while(novoFuncionario == 1){
        System.out.println("Informe o dia do mês(1 á 30):" );
        int diaMes = teclado.nextInt();

        while (diaMes < 1 || diaMes > 30){
            System.out.println("Dia Inválido");
            System.out.println("Informe o dia do mês(1 á 30):");
            diaMes = teclado.nextInt();
        }

        System.out.println("Informe o Total de Peças produzidas de manhã:");
        int totalPecasManha = teclado.nextInt();

        System.out.println("Informe o total de peças produzidas de tarde:");
        int totalPecasTarde = teclado.nextInt();
                
        totalPecasDia = totalPecasManha + totalPecasTarde;

        if (totalPecasDia > pecasMaiorProducao){
            pecasMaiorProducao = totalPecasDia;
            diaMaiorProducao = diaMes;

            if (totalPecasManha > totalPecasTarde){
                periodoMaiorProducao = "Manhã";
            }else{
                periodoMaiorProducao = "Tarde";
            }
        }
        
        if (diaMes <= 15){            
            if (totalPecasDia > 100 && totalPecasManha >= 30 
                && totalPecasTarde >= 30 ){
                valorRecebido = 0.80 * totalPecasDia;
            }else{
                valorRecebido = 0.50 * totalPecasDia;
            }

        }else{
            valorRecebido = 0.40 * totalPecasManha;
            valorRecebido +=  0.30 * totalPecasTarde;
        }

        System.out.println("R$ "+valorRecebido+ " (valor recebido)");

        System.out.println("Novo Funcionário (1 - Sim / 2 - Não)");
        novoFuncionario = teclado.nextInt();

    }
    
    System.out.println("O dia da maior produção foi: "+diaMaiorProducao);
    System.out.println("O período que o funcionário mais produziu foi de "+periodoMaiorProducao);
    teclado.close();

   }
}
