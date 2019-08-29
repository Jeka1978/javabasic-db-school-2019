package adapter_pattern;

/**
 * @author Evgeny Borisov
 */
public class Table implements Costable {
    @Override
    public double getCost() {
        return 12;
    }
}
