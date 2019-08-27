package real_spring.quoters;

import lombok.Data;
import my_spring.Benchmark;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.annotation.PreDestroy;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
@Benchmark
@DeprecatedClass(newClass = T1000.class)
public class TerminatorQuoter implements Quoter {
    private List<String> messages;
    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    @PreDestroy
    public void killAll(){
        new Thread(() -> System.out.println("You are terminated")).start();

    }
}
