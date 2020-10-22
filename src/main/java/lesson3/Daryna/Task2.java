package lesson3.Daryna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static <V> Collection<V> withoutDuplicate(Collection<V> collection) {
        Set<V> set = new HashSet<>(collection);
        collection.clear();
        collection.addAll(set);
        return collection;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(2);
        withoutDuplicate(arrayList);

    }
}