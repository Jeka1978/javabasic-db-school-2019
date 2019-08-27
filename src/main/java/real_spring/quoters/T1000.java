package real_spring.quoters;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
public class T1000 extends TerminatorQuoter {
    @Override
    public void sayQuote() {
        System.out.println("Where is John Connor?");
    }
}
