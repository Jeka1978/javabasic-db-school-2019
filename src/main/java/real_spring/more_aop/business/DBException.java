package real_spring.more_aop.business;

/**
 * @author Evgeny Borisov
 */
public class DBException extends RuntimeException {
    public DBException(String message) {
        super(message);
    }

    public DBException(String message, Throwable cause) {
        super(message, cause);
    }
}
