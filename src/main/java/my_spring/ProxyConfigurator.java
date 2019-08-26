package my_spring;

/**
 * @author Evgeny Borisov
 */
public interface ProxyConfigurator {
    <T> Object wrapWithProxy(Object t, Class<T> type);
}
