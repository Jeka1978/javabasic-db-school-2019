package real_spring.more_aop.business;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
public class SomeDaoImpl implements SomeDao {
    @Override
    public void saveData() {
        System.out.println("trying to save...");
        throw new DBException("fire all DBA");
    }
}
