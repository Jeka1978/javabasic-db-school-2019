package real_spring.more_aop;

import org.springframework.context.annotation.*;
import real_spring.more_aop.business.SomeService;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@ImportResource("classpath:aop.xml")
@PropertySource("classpath:mail.properties")
@EnableAspectJAutoProxy
public class ConfigConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigConfig.class);
        SomeService someService = context.getBean(SomeService.class);

        while (true) {
            try {
                someService.work();
            } catch (Exception e) {
                System.out.println("Была проблема, но мы решаем");
            }
        }

    }
}
