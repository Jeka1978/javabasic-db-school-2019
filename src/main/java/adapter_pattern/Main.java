package adapter_pattern;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        List<Costable> costables = Stream.generate(productRepo::getProduct)
                .limit(20).collect(Collectors.toList());
        PriceCalc priceCalc = new PriceCalc();
//        priceCalc.total(costables)
    }
}
