package lesson3.homework_answers;

import java.util.HashSet;
import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        String[] listOrders = {"Order 1", "Order 2", "Order 3", "Order 4", "Order 5", "Order 2", "Order 4"};
        TreeSet<String> treeSetOrderList = new TreeSet<>();
        HashSet<String> hashSetOrderList = new HashSet<>();
        for (String order : listOrders) {
            treeSetOrderList.add(order);
            hashSetOrderList.add(order);
        }
    }
}
