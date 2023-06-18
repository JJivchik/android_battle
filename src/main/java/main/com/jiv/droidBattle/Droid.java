package main.com.jiv.droidBattle;

import java.util.Random;

public class Droid {
    public static int productionNumber = 0;
    private final String droidModel;
    private int health; // total amount of health
    private final int attackPower; // -health by hit
    private final int mobility; // modifier for dodge chance. 40%
    private final int strength; // modifier for applied force. 40%

    public Droid(String droidModel, int health, int attackPower, int mobility, int strength) {
        this.droidModel = droidModel + "-" + ++productionNumber;
        this.health = health;
        this.mobility = mobility;
        this.strength = strength;
        this.attackPower = attackPower;
    }
    public void AttackEnemy(Droid enemy) {
        System.out.println(this.droidModel + " Going to attack " + enemy.droidModel);
        if (enemy.tryToDodge(this)) {
            System.out.println(enemy.droidModel + " Successfully dodged attack of " + this.droidModel);
        }else {
            enemy.health = enemy.health - this.attackPower;
            if (enemy.health <= 0) {
                System.out.println(this.droidModel + " Destroyed" + enemy.droidModel);
            }else {
                System.out.println(enemy.droidModel + " Survived attack with " + enemy.health + " hp");
            }
        }
    }
    public boolean tryToDodge(Droid enemy) {
        float defenderStats = (float)(this.mobility * throwDice() * 0.4)
                + (float)(this.strength * throwDice() * 0.4);
        System.out.println(this.droidModel + " tries to defend with power - " + defenderStats);
        float attackerStats = (float)(enemy.mobility * throwDice() * 0.4)
                + (float)(this.strength * throwDice() * 0.4);
        System.out.println(enemy.droidModel + " trie to attack with power - " + attackerStats);
        return attackerStats < defenderStats;
    }

    public int throwDice() {
        //from 0 to 12
        Random random = new Random();
        return random.nextInt(0,5);
    }

    public int getHealth() {
        return health;
    }
}
