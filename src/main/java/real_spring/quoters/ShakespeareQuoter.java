package real_spring.quoters;

import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
public class ShakespeareQuoter implements Quoter {
    private String message;

    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
