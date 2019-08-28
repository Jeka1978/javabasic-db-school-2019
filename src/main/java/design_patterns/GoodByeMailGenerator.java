package design_patterns;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class GoodByeMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        return "<html> не забудьте сделать домашку </html>";
    }

    @Override
    public int mailCode() {
        return 3;
    }
}
