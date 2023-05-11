package br.com.teach.kauesoares.desafioFinal.NotUsed;

import br.com.teach.kauesoares.desafioFinal.main.Fighter;
import br.com.teach.kauesoares.desafioFinal.main.Player;

import java.util.Scanner;

public class GameWithPlayerOptions {
    /**
     * Método para reproduzir as mensagens que vão ser apresentadas em todos os turnos
     *
     * @param player
     * Jogador da rodada
     */
    private void turnMessage(Player player){
        System.out.println("Vez de " + player.getName() + ":");
        System.out.println("1 - ataque normal");
        System.out.println("2 - ataque especial");
        System.out.print("-> ");
    }

    /**
     * Método para receber a escolha do jogador, avaliar se ela é válida e executar a ação
     *
     * @param fighterOne
     * Jogador que faz o ataque
     * @param fighterTwo
     * Jogador que recebe o ataque
     *
     * @throws NumberFormatException
     * Joga uma NumberFormatException caso o valor inserido seja diferente de 1 ou 2
     */
    private void moviment(Fighter fighterOne, Fighter fighterTwo) throws NumberFormatException {

        Scanner scan = new Scanner(System.in);

        Integer escolha = Integer.parseInt(scan.next());
        System.out.println();

        if( escolha != 1 && escolha != 2){
            throw new NumberFormatException();
        }

        if (escolha == 1) {
            fighterOne.dealDamage(fighterTwo);
        } else {
            fighterOne.useSpecial(fighterTwo);
        }

    }

    /**
     * Método para informar o jogador vencedor
     *
     * @param player
     * Jogador que venceu a partida
     */
    private void winMessage(Player player) {
        System.out.println("O lutador de " + player.getName() + " venceu com " + player.getFighter().getLife() + " de vida!");
    }

    /**
     *
     * Método para iniciar o jogo
     *
     * @param playerOne
     * Jogador um
     * @param playerTwo
     * Jogador dois
     */
    public void initGame(Player playerOne, Player playerTwo) {

        Fighter fighterOne = playerOne.getFighter();
        Fighter fighterTwo = playerTwo.getFighter();


        while (true) {

            //Salva a vida inicial do jogador 2 para o caso de ocorrer algum movimento inválido depois de ele ter sofrido dano
            Integer initialLifeOfFighterTwo = fighterTwo.getLife();

            //Exibe a mensagem de turno
            turnMessage(playerOne);

            try {

                moviment(fighterOne, fighterTwo);

            } catch (NumberFormatException e) {
                System.out.println("Valor inválido, turno será repetido!");
                System.out.println();

                //Caso algum erro aconteça, repete o turno
                continue;
            }

            if (fighterTwo.getLife() <= 0) {
                winMessage(playerOne);

                //Caso o jogador um vença, encerra o método
                break;
            }

            //Exibe a mensagem de turno
            turnMessage(playerTwo);

            try {

                moviment(fighterTwo, fighterOne);

            } catch (NumberFormatException e) {

                //Caso aconteça algum erro neste ponto, o jogador um já terá inflingido dano ao jogador 2, portanto a vida é resetada
                fighterTwo.setLife(initialLifeOfFighterTwo);
                System.out.println("Valor inválido, turno será repetido!");
                System.out.println();

                //Repete a rodada
                continue;
            }

            if (fighterOne.getLife() <= 0) {
                winMessage(playerTwo);

                //Caso o jogador 2 vença, encerra o método
                break;
            }

            //Caso ambos os heróis tenham vida para mais um turno, o jogo continua após a mensagem
            System.out.println("Vida do lutador do jogador 1: " + fighterOne.getLife());
            System.out.println("Vida do lutador do jogador 2: " + fighterTwo.getLife());
            System.out.println("A batalha irá continuar!");
            System.out.println("--------------------");
            System.out.println();

        }
    }

}
