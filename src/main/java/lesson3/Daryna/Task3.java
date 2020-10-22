package lesson3.Daryna;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task3 {

    public static <K, V> Map<V, Collection<K>> replaceKeyWithValue(Map<? extends K, ? extends V> inputMap) {
        Map<V, Collection<K>> resultMap = new HashMap<>();

        for (K key : inputMap.keySet()) {
            V value = inputMap.get(key);
            if (resultMap.containsKey(value)) {
                Collection<K> resultValue = resultMap.get(value);
                resultValue.add(key);
                resultMap.put(value, resultValue);
            } else {
                Collection<K> resultValue = new HashSet<>();
                resultValue.add(key);
                resultMap.put(value, resultValue);
            }
        }

        return resultMap;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        passportsAndNames.put(100000, "Лидия");
        passportsAndNames.put(111111, "Иван");
        passportsAndNames.put(222222, "Иван");
        passportsAndNames.put(823525, "Дональд");
        System.out.println(replaceKeyWithValue(passportsAndNames));
    }
}
