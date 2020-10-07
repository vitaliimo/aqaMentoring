package lesson3.homework_answers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task5 {

    public static <K, V> Map<K, V> createMap(ArrayList<K> key, ArrayList<V> value) {
        Map<K, V> map = new HashMap<>();

        if (key.size() > value.size()) {
            for (int i = 0; i < value.size(); i++) {
                map.put(key.get(i), value.get(i));
            }

            for (int i = value.size(); i < key.size(); i++) {
                map.put(key.get(i), null);
            }

        } else {
            for (int i = 0; i < key.size(); i++) {
                map.put(key.get(i), value.get(i));
            }
        }
        return map;
    }

    public static <K, V> Map<K, V> createMapWhenCatchError(ArrayList<K> key, ArrayList<V> value) {
        Map<K, V> map = new HashMap<>();

        if (key.size() >= value.size()) {
            for (int i = 0; i < key.size(); i++) {
                try {
                    map.put(key.get(i), value.get(i));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Value is not enough for map");
                }
            }
        } else {
            for (int i = 0; i < value.size(); i++) {
                try {
                    map.put(key.get(i), value.get(i));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Key is not enough for map");
                }
            }
        }
        return map;
    }
}
