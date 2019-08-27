package real_spring.profiles_examples;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class MainService {
    private final Repo repo;

//    @Scheduled(fixedDelay = 1000)
    public void work(){
        repo.crud();
    }

}
