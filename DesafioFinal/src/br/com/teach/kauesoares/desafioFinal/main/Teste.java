package br.com.teach.kauesoares.desafioFinal.main;
public class Teste {
    public static void main(String[] args) {
        Special specialDoKen;
        Special specialDoRyu;

        Ryu ryu;
        Ken ken;

        Player playerOne;
        Player playerTwo;

        Game game;

        specialDoKen = new Special("Especial do Ken", 5);
        specialDoRyu = new Special("Especial do Ryu", 7);

        ryu = new Ryu("Ryu", 3, 20, specialDoRyu);
        ken = new Ken("Ken", 2, 40, specialDoKen);

        playerOne = new Player("João", ryu);
        playerTwo = new Player("Maria", ken);

        game = new Game();

        Player winner = game.initGame(playerOne, playerTwo);

        System.out.println("O vencedor foi " + winner.getName());

    }
}
