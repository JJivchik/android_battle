package main.com.jiv.droidBattle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "main.com.jiv.droidBattle")
public class AppConfig {

    @Bean
    public Droid t800() {
        return new Droid("T800",50, 25, 10, 30);
    }
    @Bean
    public Droid t1000() {
        return new Droid("T1000", 50, 25, 15, 25);
    }
    @Bean
    public Battler battler(List<Droid> droids) {
        return new Battler(droids);
    }
}
