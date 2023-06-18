package main.com.jiv;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.beancontext.BeanContext;
@Component("helloWorld")
public class HelloWorld {
    public String message;

    @Autowired
    public void saySomething() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
