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
        List<Priceable> costables = Stream.generate(productRepo::getProduct)
                .limit(20)
                .map(costable -> (Priceable) costable::getCost)
//                .map(Costable2PriceableAdapter::new)
                .collect(Collectors.toList());
        PriceCalc priceCalc = new PriceCalc();
        System.out.println(priceCalc.total(costables));
    }
}







