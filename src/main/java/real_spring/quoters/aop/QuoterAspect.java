package real_spring.quoters.aop;

import design_patterns.strategy.heroes.RandomUtil;
import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
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


    @SneakyThrows
    @Around("@annotation(real_spring.quoters.business.Secured)")
    public Object doSecured(ProceedingJoinPoint pjp){
        int i = RandomUtil.getRandomInRange(0, 10);
        if (i < 5) {
            return pjp.proceed();
        }else {
            throw new SecurityException("not allowed here, try again later");
        }
    }

    @Before("allSayMethods()")
    public void handleSayMethods(JoinPoint jp){
        String name = jp.getTarget().getClass().getSimpleName();
        System.out.println("А тепепь цитата "+ name+" : ");
    }
}




