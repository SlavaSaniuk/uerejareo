package by.bsac.collections;

import java.util.Map;
import java.util.stream.Collectors;

public class MapUtils {

    public static <K, V> Map<V, K> invertMap(Map<K, V> src) {
        return src.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

}
