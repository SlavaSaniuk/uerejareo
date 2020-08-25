package by.bsac.interfaces;

/**
 * {@link PrivateClass} interface identify that's this class can't have a instance (except singleton class).
 * Call {@link PrivateClass#assertionError()} method from private constructor to disallow construct new instances via reflection.
 */
public interface PrivateClass {

    /**
     * Method throws new {@link AssertionError} with "This class marked as private.
     * You can't to create instances of this class." error message.
     * @throws AssertionError - throws error in any cases.
     */
    default void assertionError() throws AssertionError {
        throw new AssertionError("This class marked as private. You can't to create instances of this class.");
    }
}
