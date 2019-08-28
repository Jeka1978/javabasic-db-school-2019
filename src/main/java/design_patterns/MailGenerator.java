package design_patterns;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public interface MailGenerator {
    String generateMail();

}
