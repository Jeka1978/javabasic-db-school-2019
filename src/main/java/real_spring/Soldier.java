package real_spring;

import lombok.Data;
import my_spring.Speaker;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Evgeny Borisov
 */
@Data
public class Soldier {
    private int age;

    public void setAge(String age) {
        System.out.println(age);
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    }
}
