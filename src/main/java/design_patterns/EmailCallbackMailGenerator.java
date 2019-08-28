package design_patterns;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        //20 lines of code
        return "<HTML> don't call us Nikolas</HTML>";
    }

    @Override
    public int mailCode() {
        return 2;
    }


}
