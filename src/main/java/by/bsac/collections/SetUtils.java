package by.bsac.collections;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class SetUtils {

    private SetUtils() {}

    public static  <T> Set<T> asSet(T[] array) {
        return Arrays.stream(array).collect(Collectors.toSet());
    }


}
