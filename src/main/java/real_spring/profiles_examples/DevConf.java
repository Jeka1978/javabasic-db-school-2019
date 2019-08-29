package real_spring.profiles_examples;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import static real_spring.profiles_examples.ProfilesConst.DEV;
import static real_spring.profiles_examples.ProfilesConst.PROD;

/**
 * @author Evgeny Borisov
 */
@Configuration
@Profile(DEV)
@PropertySource("classpath:dev.properties")
//@ComponentScan("packages which contains needed only for dev environment")
public class DevConf {

//    @Bean
//    public












}
