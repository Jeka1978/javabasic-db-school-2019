package adapter_pattern;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class PriceCalc {
    public double total(List<Priceable> priceables) {
       return priceables.stream().mapToDouble(Priceable::getPrice).sum();
    }
}
