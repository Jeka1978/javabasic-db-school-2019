package real_spring.more_aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class SomeService {
    @Autowired
    private SomeDao dao;

    public void work(){
        System.out.println("working...");
        dao.saveData();
    }
}
