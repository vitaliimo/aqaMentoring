package lesson3.Svitlana.Task5;

import com.sun.deploy.security.SelectableSecurityManager;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;
import java.util.*;

public class SortedMap {

    public static <K, V> Map<K, V> sortedMap(ArrayList<K> key, ArrayList<V> value) {
        Map<K, V> newSortedMap = new HashMap<>();

        if (key.size() > value.size()) {
            for (int i = 0; i < value.size(); i++) {
                newSortedMap.put(key.get(i), value.get(i));
            }
            for (int i = value.size(); i < key.size(); i++) {
                newSortedMap.put(key.get(i), null);
            }
        } else {
            for (int i = 0; i < key.size(); i++) {
                newSortedMap.put(key.get(i), value.get(i));
            }
        }
        System.out.println(newSortedMap);
        return newSortedMap;
    }

    public static <K, V> Map<K, V> mapWithErrorException(ArrayList<K> key, ArrayList<V> value) {
        Map<K, V> newMapWithErrorExc = new HashMap<>();

        if (key.size() >= value.size()) {
            for (int i = 0; i < key.size(); i++) {
                try {
                    newMapWithErrorExc.put(key.get(i), value.get(i));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Value is not enough for map");
                }
            }
        } else {
            for (int i = 0; i < value.size(); i++) {
                try {
                    newMapWithErrorExc.put(key.get(i), value.get(i));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Key is not enough for map");
                }
            }
        }
        System.out.println(newMapWithErrorExc);
        return newMapWithErrorExc;
    }

    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add("Kiev");
        arr1.add("Lviv");
        arr1.add("Kharkiv");
        arr1.add("Vinnusa");
        arr2.add(200);
        arr2.add(500);
        arr2.add(300);
        arr2.add(400);
        arr2.add(600);
        arr2.add(700);
        sortedMap(arr1, arr2);
        mapWithErrorException(arr1, arr2);
    }
}
