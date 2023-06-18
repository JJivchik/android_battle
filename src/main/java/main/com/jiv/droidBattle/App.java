package main.com.jiv.droidBattle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        Battler battler = app.getBean(Battler.class);
        battler.beginBattle();
    }
}
