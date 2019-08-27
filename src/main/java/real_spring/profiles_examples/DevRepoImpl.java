package real_spring.profiles_examples;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import static real_spring.profiles_examples.ProfilesConst.DEV;

/**
 * @author Evgeny Borisov
 */
@Repository
@Profile(DEV)
public class DevRepoImpl implements Repo {
    @Override
    public void crud() {
        System.out.println("saved to dev");
    }
}
