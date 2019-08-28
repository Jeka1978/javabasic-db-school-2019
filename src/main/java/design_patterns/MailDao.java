package design_patterns;

import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Repository
public class MailDao {
   private static Random random = new Random();
    public int getMailCode() {
        return random.nextInt(4)+1;
    }
}
