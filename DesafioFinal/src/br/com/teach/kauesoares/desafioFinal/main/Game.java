package br.com.teach.kauesoares.desafioFinal.main;

import java.util.Scanner;

public class Game {

    /**
     *
     * Método para iniciar o jogo
     *
     * @param playerOne
     * Jogador um
     * @param playerTwo
     * Jogador dois
     */
    public Player initGame(Player playerOne, Player playerTwo) {

        Fighter fighterOne = playerOne.getFighter();
        Fighter fighterTwo = playerTwo.getFighter();

        System.out.println("-----------------------");
        System.out.println("Vida do herói de " + playerOne.getName() +": " + playerOne.getFighter().getLife());
        System.out.println("Vida do herói de " + playerTwo.getName() +": " + playerTwo.getFighter().getLife());

        System.out.println("Batalha irá começar com o jogador de " + playerOne.getName() + " atacando!");
        System.out.println("-----------------------");

        while (true) {

            fighterOne.dealDamage(fighterTwo);

            if (fighterTwo.getLife() <= 0){
                return playerOne;
            }

            fighterTwo.dealDamage(fighterOne);

            if (fighterOne.getLife() <= 0) {
                return playerTwo;
            }

            System.out.println("Vida do lutador do jogador 1: " + fighterOne.getLife());
            System.out.println("Vida do lutador do jogador 2: " + fighterTwo.getLife());
            System.out.println("A batalha irá continuar!");
            System.out.println("--------------------");
            System.out.println();

        }
    }

}
