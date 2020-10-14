package lesson3.Daryna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Task0 {
    public static void main(String[] args) {

        //the 1st picture

        LinkedList<String> linkedlist = new LinkedList<String>();
        for (int i = 0; i <= 5; i++) {
            linkedlist.add(String.format("Item%s", i));
        }
        System.out.println("Linked List Content " + linkedlist);

        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " + linkedlist);

        System.out.println("First element " + linkedlist.get(0));
        linkedlist.set(0, "Changed first item");
        System.out.println("First element after update by set method: " + linkedlist.get(0));

        linkedlist.removeFirst();
        linkedlist.removeLast();

        System.out.println("Linkedlist after deletion of first and last element: " + linkedlist);

        linkedlist.add(0, "Newly added item");
        linkedlist.remove(2);
        System.out.println("Content: " + linkedlist);

        System.out.println("Polled First: " + linkedlist.pollFirst());
        System.out.println("Content after polling the first element: " + linkedlist);

        System.out.println("Polled Last: " + linkedlist.pollLast());
        System.out.println("Content after polling the last element: " + linkedlist);


        //the 2nd picture

        int positiveCount = 0;
        int size = 0;

        ArrayList<Double> list = new ArrayList<Double>();
        for (int i = 0; i < 10; i++) {
            Double d = new Random().nextGaussian();
            list.add(d);
        }
        System.out.println("Collection is: ");
        for (Double d : list) {
          //  System.out.println("%.2f ", d);
        }
        size = list.size();

        Iterator<Double> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() > 0)
                positiveCount++;
            else
                it.remove();
        }
        //System.out.println("%n Numbers that > 0 (count): %d", positiveCount);
        //System.out.println("%n Numbers that <=0 (count): %d", size - positiveCount);

        System.out.println("\nThe updated collection:");
        for (Double d : list) {
            //System.out.println("%.2f ", d);
        }
    }

}
