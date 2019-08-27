package real_spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import my_spring.Speaker;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Evgeny Borisov
 */
@Data
public class Soldier {
    private String name;
    private String family;

    public Soldier(String имя, String фамилия) {
       name = имя;
       family = фамилия;
    }

    public void printMe() {
        System.out.println(this);
    }
}
