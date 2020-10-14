package lesson3.Daryna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task5 {
    public static <K, V> Map<K, V> inMapTransformtion2(ArrayList<K> arrayList_K, ArrayList<V> arrayList_V) throws Exception {

        Map<K, V> map = new TreeMap<>();


        if (arrayList_K.size() == arrayList_V.size()) {

            for (int i = 0, j = 0; i < arrayList_K.size(); i++, j++) {
                map.put(arrayList_K.get(i), arrayList_V.get(j));
            }


        } else if (arrayList_K.size() > arrayList_V.size())
            throw new Exception("Value is not enough for map");
        else throw new Exception("Key is not enough for map");

        return map;
    }


    public static <K, V> Map<K, V> inMapTransformtion1(ArrayList<K> arrayList_K, ArrayList<V> arrayList_V) {

        Map<K, V> map = new TreeMap<>();
        if (arrayList_K.size() == arrayList_V.size()) {
            for (int i = 0, j = 0; i < arrayList_K.size(); i++, j++) {
                map.put(arrayList_K.get(i), arrayList_V.get(j));
            }

        } else if (arrayList_K.size() > arrayList_V.size()) {

            int delta = arrayList_K.size() - arrayList_V.size();

            for (int i = 1; i <= delta; i++) {
                arrayList_V.add(null);
            }
            for (int i = 0, j = 0; i < arrayList_K.size(); i++, j++) {
                map.put(arrayList_K.get(i), arrayList_V.get(j));
            }

        } else {
            int delta = arrayList_V.size() - arrayList_K.size();
            for (int i = 1; i <= delta; i++) {
                arrayList_V.remove(i);
            }
            for (int i = 0, j = 0; i < arrayList_K.size(); i++, j++) {
                map.put(arrayList_K.get(i), arrayList_V.get(j));
            }


        }

        return map;


    }


    public static void main(String[] args) throws Exception {

        ArrayList<String> arrayList_K = new ArrayList<>();
        arrayList_K.add("Katia");
        arrayList_K.add("Oleg");
        arrayList_K.add("Nastia");

        ArrayList<Integer> arrayList_V = new ArrayList<>();
        arrayList_V.add(5);
        arrayList_V.add(3);
        arrayList_V.add(2);
        arrayList_V.add(4);

        Map<String, Integer> map = inMapTransformtion1(arrayList_K, arrayList_V);
        System.out.println(map);

//        Map<String, Integer> map1 = inMapTransformtion2(arrayList_K, arrayList_V);
//        System.out.println(map1);
    }


}
