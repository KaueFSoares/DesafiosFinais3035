package br.com.teach.kauesoares.desafioFinal.main;

public class Player {
    private String name;
    private Fighter fighter;

    public Player(String name, Fighter fighter) {
        this.name = name;
        this.fighter = fighter;
    }

    public Fighter getFighter() {
        return fighter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFighter(Fighter fighter) {
        this.fighter = fighter;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
