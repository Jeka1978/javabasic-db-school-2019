package design_patterns;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        //20 lines of code
        return "<HTML> Welcome new client</HTML>";
    }

    @Override
    public int mailCode() {
        return 1;
    }
}
