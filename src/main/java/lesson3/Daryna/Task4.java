package lesson3.Daryna;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        String[] arrayOfOrdersIDs = {"12345", "12345", "11111", "22222", "12345"};

        HashSet<String> hashSetOfOrders = new HashSet<>();
        TreeSet<String> treeSetOfOrders = new TreeSet<>();

        for (String s : arrayOfOrdersIDs) {
            hashSetOfOrders.add(s);
            treeSetOfOrders.add(s);
        }
        System.out.println(hashSetOfOrders);
        System.out.println(treeSetOfOrders);
    }
}
