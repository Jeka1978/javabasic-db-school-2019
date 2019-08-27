package real_spring.qualifiers_examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static real_spring.qualifiers_examples.DBType.MONGO;
import static real_spring.qualifiers_examples.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 */
@Service
public class DBService {
    @DeutscheBankRepo(MONGO)
    private Dao dao;

    @DeutscheBankRepo(ORACLE)
    private Dao backupDao;


    @Scheduled(fixedDelay = 500)
    public void work(){
        dao.saveAll();
    }

    @Scheduled(fixedDelay = 3000)
    public void backup(){
        backupDao.saveAll();
    }















}
