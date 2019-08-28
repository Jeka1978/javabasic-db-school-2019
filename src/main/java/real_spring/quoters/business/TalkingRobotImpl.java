package real_spring.quoters.business;

import lombok.Data;
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
    @Book
    private List<Quoter> quoters;


    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }


}
