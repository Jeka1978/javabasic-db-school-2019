package real_spring.quoters;

import lombok.Data;
import my_spring.Benchmark;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
public class TalkingRobotImpl implements TalkingRobot {
    private List<Quoter> quoters;

    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }


}
