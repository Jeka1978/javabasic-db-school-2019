package real_spring.profiles_examples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Confi.class)
@ActiveProfiles("dev")
public class MainServiceTest {
    @Autowired
    private MainService mainService;


    @Test
    public void work() {
        mainService.work();
    }
}












