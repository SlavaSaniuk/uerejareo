package by.bsac.annotations.pattern;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@link Builder} marker annotation identify that's class designed with "Builder" pattern.
 * This builder must build this {@link Builder#value} object instances.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface Builder {

    /**
     * Instances builds with this builder.
     */
    Class<?> value = null;
}
