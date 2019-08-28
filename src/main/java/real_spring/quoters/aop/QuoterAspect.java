package real_spring.quoters.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Aspect
@Component
public class QuoterAspect {

    @Pointcut("execution(* real_spring.quoters.business.*.say*(..))")
    public static void allSayMethods(){}


    @Before("allSayMethods()")
    public void handleSayMethods(){
        System.out.println("А тепепь цитата:");
    }
}




