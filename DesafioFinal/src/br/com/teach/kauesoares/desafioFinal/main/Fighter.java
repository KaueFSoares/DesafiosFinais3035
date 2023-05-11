package br.com.teach.kauesoares.desafioFinal.main;

public abstract class Fighter {
    private String name;
    private Integer power;
    private Integer life;
    private Special special;

    public abstract void receiveDamage(Integer damage);

    public abstract void dealDamage(Fighter fighter);

    public abstract void useSpecial(Fighter fighter);

    public Fighter(String name, Integer power, int life, Special special) {
        this.name = name;
        this.power = power;
        this.life = life;
        this.special = special;
    }

    public String getName() {
        return name;
    }

    public Integer getPower() {
        return power;
    }

    public int getLife() {
        return life;
    }

    public Special getSpecial() {
        return special;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public void setSpecial(Special special) {
        this.special = special;
    }
}
