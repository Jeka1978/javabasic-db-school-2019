package design_patterns;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("3")
public class MailGeneratorImpl implements MailGenerator {
    @Override
    public String generateMail() {
        return "Используйте Спринг!";
    }
}
