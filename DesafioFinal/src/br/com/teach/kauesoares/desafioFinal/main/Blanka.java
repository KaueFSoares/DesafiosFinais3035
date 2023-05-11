package br.com.teach.kauesoares.desafioFinal.main;

public class Blanka extends Fighter{

    public Blanka(String name, Integer power, int life, Special special) {
        super(name, power, life, special);
    }

    @Override
    public void receiveDamage(Integer damage) {
        setLife(getLife() - damage);
    }

    @Override
    public void dealDamage(Fighter fighter) {
        fighter.receiveDamage(getPower());
    }

    @Override
    public void useSpecial(Fighter fighter) {
        fighter.receiveDamage(getSpecial().getValueEspecial());
    }

}
