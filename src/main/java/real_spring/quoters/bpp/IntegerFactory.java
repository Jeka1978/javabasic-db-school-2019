package real_spring.quoters.bpp;

import design_patterns.strategy.heroes.RandomUtil;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Evgeny Borisov
 */
public class IntegerFactory {
    public Integer createInteger() throws Exception {
        return RandomUtil.getRandomInRange(0, 100);
    }
}