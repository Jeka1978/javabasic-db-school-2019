package real_spring.quoters.bpp;

import my_spring.InjectRandomIntAnnotationObjectConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {

    private InjectRandomIntAnnotationObjectConfigurator injectConfigurator = new InjectRandomIntAnnotationObjectConfigurator();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        injectConfigurator.configure(bean);
        return bean;
    }

}
