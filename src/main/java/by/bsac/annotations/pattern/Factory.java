package by.bsac.annotations.pattern;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@link Factory} marker annotation identifity that's class designed with "Factory" pattern.
 * {@link Factory#value} is that this factory produce their object.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface Factory {

    /**
     * Class of produced objects.
     */
    Class<?> value = null;
}
