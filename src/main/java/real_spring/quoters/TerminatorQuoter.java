package real_spring.quoters;

import lombok.Data;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
public class TerminatorQuoter implements Quoter {
    private List<String> messages;
    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }
}
