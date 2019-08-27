package real_spring.qualifiers_examples;

import org.springframework.context.annotation.Primary;

/**
 * @author Evgeny Borisov
 */
@DeutscheBankRepo(DBType.MONGO)
//@Primary
public class MongoDao implements Dao {
    @Override
    public void saveAll() {
        System.out.println("saved to Mongo");
    }
}
