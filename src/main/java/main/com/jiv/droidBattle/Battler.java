package main.com.jiv.droidBattle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component("battler")
public class Battler {
    List<Droid> droidList;

    public Battler (List<Droid> droids) {
        this.droidList = droids;
    }
    public void beginBattle() {
        int aliveDroids = droidList.size();
        while(aliveDroids > 1) {
            Droid attacker = droidList.get(0);
            Droid defender = droidList.get(1);

            attacker.AttackEnemy(defender);
            if (defender.getHealth() <= 0) {
                droidList.remove(defender);
                aliveDroids--;
            }
        }
    }

//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        List<Droid> droids = new ArrayList<>();
//        droids.add(context.getBean("T800", Droid.class));
//        droids.add(context.getBean("T1000", Droid.class));
//        Battler battler = new Battler(droids);
//        battler.beginBattle();
//    }
}
