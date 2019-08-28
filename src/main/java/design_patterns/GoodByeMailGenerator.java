package design_patterns;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("3")
public class GoodByeMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        return "<html> не забудьте сделать домашку </html>";
    }

}
