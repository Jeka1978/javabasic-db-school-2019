package real_spring.quoters;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@PropertySource("classpath:application.properties")
public class Conf {
}


