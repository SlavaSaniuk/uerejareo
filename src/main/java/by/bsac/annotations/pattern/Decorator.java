package by.bsac.annotations.pattern;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@link Decorator} marker annotation identify that's this class designed with "Decorator" pattern.
 * {@link Decorator#value} identify interface that's this builder must implements.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface Decorator {

    /**
     * Interface class instance that's this decorator must implements.
     */
    Class<?> value = null;
}
