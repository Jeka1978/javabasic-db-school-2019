package adapter_pattern;

import design_patterns.strategy.heroes.RandomUtil;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ProductRepo {
    private List<Costable> cache = List.of(new Chair(), new Table());


    public Costable getProduct() {
        return cache.get(RandomUtil.getRandomInRange(0, cache.size()));
    }
}
