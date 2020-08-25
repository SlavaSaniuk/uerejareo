package by.bsac.annotations.pattern;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@link Singleton} marker annotation identifity that class designed with "Singleton" pattern.
 * {@link Singleton#value} specified the static final singleton instance name;
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface Singleton {

    /**
     * Name of static final singleton instance;
     */
    String value = "INSTANCE";
}
