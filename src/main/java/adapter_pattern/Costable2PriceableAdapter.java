package adapter_pattern;

import lombok.AllArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public class Costable2PriceableAdapter implements Priceable {
    private Costable costable;

    @Override
    public double getPrice() {
        return costable.getCost();
    }
}
