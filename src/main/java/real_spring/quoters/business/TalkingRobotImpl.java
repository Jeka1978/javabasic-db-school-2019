package real_spring.quoters.business;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import real_spring.quoters.Book;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
@Component
public class TalkingRobotImpl implements TalkingRobot {
    @Autowired
    private List<Quoter> quoters;


    @Override
    @EventListener(ContextRefreshedEvent.class)
    @Secured
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }


}
