package design_patterns;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("1")
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        //20 lines of code
        return "<HTML> Welcome new client</HTML>";
    }

}
