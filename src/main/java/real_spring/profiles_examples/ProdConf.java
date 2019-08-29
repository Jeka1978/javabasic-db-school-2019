package real_spring.profiles_examples;

import org.springframework.context.annotation.*;

import static real_spring.profiles_examples.ProfilesConst.PROD;

/**
 * @author Evgeny Borisov
 */
@Configuration
@Profile(PROD)
@PropertySource("classpath:prod.properties")
//@ComponentScan("packages which contains only beans needed for production, but not for dev environment")
public class ProdConf {

//    @Bean
//    public












}
