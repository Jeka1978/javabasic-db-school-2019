package adapter_pattern;

/**
 * @author Evgeny Borisov
 */
public class Chair implements Costable {
    @Override
    public double getCost() {
        return 10;
    }
}
