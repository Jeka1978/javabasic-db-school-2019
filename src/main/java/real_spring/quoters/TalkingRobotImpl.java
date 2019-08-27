package real_spring.quoters;

import lombok.Data;
import my_spring.Benchmark;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.SQLDataException;
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
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }


}
