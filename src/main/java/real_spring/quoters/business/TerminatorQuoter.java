package real_spring.quoters.business;

import my_spring.Benchmark;
import org.springframework.beans.factory.annotation.Value;
import real_spring.quoters.Film;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Benchmark
@Film
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String[] messages,@Value("${M2_HOME}") String javaHome) {
        System.out.println("javaHome = " + javaHome);
        this.messages = new ArrayList<>(Arrays.asList(messages));
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    @PreDestroy
    public void killAll(){
        new Thread(() -> System.out.println("You are terminated")).start();

    }
}
