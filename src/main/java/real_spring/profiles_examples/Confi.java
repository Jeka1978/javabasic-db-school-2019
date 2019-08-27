package real_spring.profiles_examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
public class Confi {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "prod");
        new AnnotationConfigApplicationContext(Confi.class);
    }
}
