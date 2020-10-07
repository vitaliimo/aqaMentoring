package lesson3.homework_answers;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task3 {
    public static <K, V> Map<V, Collection<K>> replaceKeyWithValue(Map<? extends K, ? extends V> map) {
        Map<V, Collection<K>> convertedMap = new HashMap<>();
        for (K key : map.keySet()) {
            V value = map.get(key);
            if (convertedMap.containsKey(value)) {
                Collection<K> listKeys = convertedMap.get(value);
                listKeys.add(key);
                convertedMap.put(value, listKeys);
            } else {
                Collection<K> listKeys = new HashSet<>();
                listKeys.add(key);
                convertedMap.put(value, listKeys);
            }
        }
        return convertedMap;
    }
}
