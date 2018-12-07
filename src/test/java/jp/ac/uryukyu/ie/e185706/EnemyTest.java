package jp.ac.uryukyu.ie.e185706;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    public void attack() {

        int heroHP = 10;
        LivingThing hero = new LivingThing("テスト勇者", heroHP, 5);
        LivingThing enemy = new LivingThing("テストスライム", 6, 3);
        enemy.setDead(true);
        for(int i=0; i<10; i++) {
            enemy.attack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        assertEquals(heroHP, hero.getHitPoint());
    }
}