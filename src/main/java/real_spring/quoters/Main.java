package real_spring.quoters;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */


public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        System.out.println(context.getBean(Integer.class));
        System.out.println(context.getBean(Integer.class));
        System.out.println(context.getBean(Integer.class));
        context.close();
    }
}
