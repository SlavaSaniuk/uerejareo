package by.bsac.assertions;

import by.bsac.annotations.any.Utility;
import by.bsac.interfaces.PrivateClass;

/**
 * {@link Asserts} utility class contains static methods to validate any objects.
 */
@Utility
public class Asserts implements PrivateClass {

    // Private utility class constructor;
    private Asserts() throws AssertionError {
        // Call assertion error:
        assertionError();
    }

    /**
     * Assert that's object parameter is not null.
     * @param a_obj - Object to assert;
     * @param a_parameter - parameter name ( used in error message );
     * @throws RuntimeAssertionException - if target object is null;
     */
    public static void notNull(Object a_obj, String a_parameter) throws RuntimeAssertionException {
        if (a_obj == null) throw new RuntimeAssertionException(String.format("Required not null parameter[%s] is null.", a_parameter));
    }

    /**
     * Assert that's number is not zero.
     * @param a_obj - number to assert;
     * @param a_parameter - parameter name ( used in error message );
     * @throws RuntimeAssertionException - if target number is zero;
     */
    public static void notZero(Number a_obj, String a_parameter) throws RuntimeAssertionException {
        if (a_obj.intValue() == 0) throw new RuntimeAssertionException(String.format("Required int no zero parameter[%s] is zero.", a_parameter));
    }

    /**
     * Assert that's number is above zero.
     * @param a_obj - number to assert;
     * @param a_parameter - parameter name ( used in error message );
     * @throws RuntimeAssertionException - if target number is below zero;
     */
    public static void aboveZero(Number a_obj, String a_parameter) throws RuntimeAssertionException {
        if (a_obj.intValue() <= 0) throw  new RuntimeAssertionException(String.format("Required int above zero parameter[%s] is above zero.", a_parameter));
    }

    /**
     * Inner static class represent a assertion {@link RuntimeException} runtime exception.
     */
    public static class RuntimeAssertionException extends RuntimeException {

        /**
         * Construct new runtime assertion exception with specified error message.
         * @param msg - error message;
         */
        public RuntimeAssertionException(String msg) {
            super(_message(msg));
        }

        private static String _message(String message) {
            if (message != null && !message.equals("")) return message;
            else return "Error message is undefined.";
        }

    }

}

