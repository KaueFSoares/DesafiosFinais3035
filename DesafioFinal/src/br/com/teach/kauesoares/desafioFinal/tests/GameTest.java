package br.com.teach.kauesoares.desafioFinal.tests;

import br.com.teach.kauesoares.desafioFinal.main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {

    Special specialDoKen;
    Special specialDoRyu;

    Ryu ryu;
    Ken ken;

    Player playerOne;
    Player playerTwo;

    Game game;

    @BeforeEach
    void setUp() {
        specialDoKen = new Special("Especial do Ken", 5);
        specialDoRyu = new Special("Especial do Ryu", 7);

        ryu = new Ryu("Ryu", 2, 20, specialDoRyu);
        ken = new Ken("Ken", 2, 20, specialDoKen);

        playerOne = new Player("João", ryu);
        playerTwo = new Player("Maria", ken);

        game = new Game();
    }

    @Test
    void startGameForTwoPlayers() {
        playerOne.getFighter().setLife(21);
        assertEquals(playerOne.toString(), game.initGame(playerOne, playerTwo).toString());
    }


    @Test
    void playerOneWinsTheRound() {
        playerOne.getFighter().setLife(21);
        assertEquals(playerOne.toString(), game.initGame(playerOne, playerTwo).toString());
    }


    @Test
    void playerTwoWinsTheRound() {
        playerTwo.getFighter().setLife(21);
        assertEquals(playerTwo.toString(), game.initGame(playerOne, playerTwo).toString());
    }
}