package lesson3.Svitlana.Task3;

import java.util.*;

public class ReplaceKeyWithValue {


    public static <K, V> Map<V, Collection<K>> replaceKeyWithValue(Map<? extends K, ? extends V> inputCollection) {
        Map<V, Collection<K>> mapWithReplacement = new HashMap<>();
        for (K key : inputCollection.keySet()) {
            V value = inputCollection.get(key);
            if (mapWithReplacement.containsKey(value)) {
                Collection<K> resultValue = mapWithReplacement.get(value);
                resultValue.add(key);
                mapWithReplacement.put(value, resultValue);
            } else {
                Collection<K> resultValue = new HashSet<>();
                resultValue.add(key);
                mapWithReplacement.put(value, resultValue);
            }
        }
        return mapWithReplacement;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> cart = new HashMap<>();
        cart.put("Tomato", 5);
        cart.put("Bread", 3);
        cart.put("Suger", 5);
        System.out.println(replaceKeyWithValue(cart));
    }
}
