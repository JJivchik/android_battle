package main.com.jiv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Test {
    @Autowired
    private HelloWorld helloWorld;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Test test = context.getBean(Test.class);
        test.helloWorld.saySomething();
    }
}
