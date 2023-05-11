package br.com.teach.kauesoares.desafioFinal.tests;

import br.com.teach.kauesoares.desafioFinal.main.Fighter;
import br.com.teach.kauesoares.desafioFinal.main.Ken;
import br.com.teach.kauesoares.desafioFinal.main.Ryu;
import br.com.teach.kauesoares.desafioFinal.main.Special;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RyuTest {

    Fighter ryu;
    Fighter ken;

    @BeforeEach
    void setUp() {
        ryu = new Ryu("Ryu", 3, 20, new Special("Especial do Ryu", 5));
        ken = new Ken("Ken", 2, 25, new Special("Especial do Ken", 5));
    }

    @Test
    void receiveDamageFromNormalAtack() {
        ryu.receiveDamage(ken.getPower());

        assertEquals(18, ryu.getLife());

    }

    @Test
    void receiveDamageFromSpecial() {
        ryu.receiveDamage(ken.getSpecial().getValueEspecial());

        assertEquals(15, ryu.getLife());
    }

    @Test
    void dealDamage() {
        ryu.dealDamage(ken);

        assertEquals(22, ken.getLife());
    }

    @Test
    void useSpecial() {
        ryu.useSpecial(ken);

        assertEquals(20, ken.getLife());
    }
}