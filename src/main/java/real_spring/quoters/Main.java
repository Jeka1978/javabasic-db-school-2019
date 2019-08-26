package real_spring.quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
       context.getBeansOfType(Quoter.class).values().forEach(Quoter::sayQuote);
    }
}
