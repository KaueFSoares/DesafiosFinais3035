package br.com.teach.kauesoares.desafioFinal.main;

public class Ryu extends Fighter{

    public Ryu(String name, Integer power, Integer life, Special special) {
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
