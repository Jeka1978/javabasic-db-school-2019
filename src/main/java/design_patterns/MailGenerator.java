package design_patterns;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public interface MailGenerator {
    String generateMail();
    int mailCode();

    @Autowired
    default void registerMySelf(DistributionService service) {
        service.register(mailCode(),this);
    }
}
