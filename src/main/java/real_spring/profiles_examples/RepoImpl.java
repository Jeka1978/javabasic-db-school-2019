package real_spring.profiles_examples;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import static real_spring.profiles_examples.ProfilesConst.DEV;
import static real_spring.profiles_examples.ProfilesConst.PROD;

/**
 * @author Evgeny Borisov
 */
@Repository
@Profile(PROD)
public class RepoImpl implements Repo {
    @Override
    public void crud() {
        System.out.println("saved to prod");
    }
}
