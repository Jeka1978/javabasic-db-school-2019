package real_spring.quoters.business;

import my_spring.InjectRandomInt;
import org.springframework.beans.factory.annotation.Value;
import real_spring.quoters.Book;

/**
 * @author Evgeny Borisov
 */
@Book
public class ShakespeareQuoter implements Quoter {
    @InjectRandomInt(min = 3, max = 5)
    private int repeat;
    @Value("${shake}")
    private String message;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
