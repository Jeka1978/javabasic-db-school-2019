package real_spring.qualifiers_examples;

import lombok.SneakyThrows;
import org.springframework.context.annotation.Primary;

import static real_spring.qualifiers_examples.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 */
@DeutscheBankRepo(ORACLE)
public class OracleDao implements Dao {
    @Override
    @SneakyThrows
    public void saveAll() {
        Thread.sleep(5);
        System.out.println("saved to Oracle");
    }
}
