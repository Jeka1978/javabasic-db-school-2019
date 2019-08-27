package real_spring.quoters;

import lombok.Data;
import my_spring.InjectRandomInt;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author Evgeny Borisov
 */
@Data
public class ShakespeareQuoter implements Quoter {
    @InjectRandomInt(min = 3, max = 5)
    private int repeat;
    private String message;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
