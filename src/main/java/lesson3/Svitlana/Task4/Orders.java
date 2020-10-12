package lesson3.Svitlana.Task4;

import java.util.HashSet;
import java.util.TreeSet;

public class Orders {

    public static void main(String[] args) {
        String[] orders = {"Order 1", "Order 2", "Order 3", "Order 2", "Order 4", "Order 5", "Order 5"};
        TreeSet<String> treeSetOrderList = new TreeSet<>();
        HashSet<String> hashSetOrderList = new HashSet<>();
        for (String newOrders : orders) {
            treeSetOrderList.add(newOrders);
            hashSetOrderList.add(newOrders);
        }
        System.out.println(treeSetOrderList);
        System.out.println(hashSetOrderList);
    }
}
