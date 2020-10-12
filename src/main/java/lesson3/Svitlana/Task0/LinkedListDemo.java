package lesson3.Svitlana.Task0;

import java.util.Collection;
import java.util.LinkedList;

class LinkedListDemo {

    public static void main(String arg[]) {

        LinkedList<String> linkedlist = new LinkedList<String>();

        /*add (String Element is used for adding the elements to the linked list)
         * RESULT: Linked List Content: [Item1, Item2, Item3, Item4, Item5] */
        for (int i = 1; i <= 5; i++) {
            linkedlist.add(String.format(("Item%s"), i));
        }
        System.out.println("Linked List Content: " + linkedlist);

        /*Add First and Last Element
         * RESULT: LinkedList Content after addintion: [First Item, Item1, Item2, Item3, Item4, Item5, Last Item]*/
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addintion: " + linkedlist);

        /*This is how to get and set Values
        * RESULT: First element: First Item
          First element aftre update by set method: Changed first item*/
        System.out.println("First element: " + linkedlist.get(0));
        linkedlist.set(0, "Changed first item");
        System.out.println("First element aftre update by set method: " + linkedlist.get(0));

        /*Remove first and last element
         * RESULT: LinkedList after deletion of first and last element[Item1, Item2, Item3, Item4, Item5]*/
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element" + linkedlist);

        /*Add to a Position and remove from a position
         * RESULT: Content: [New added item, Item1, Item3, Item4, Item5]*/
        linkedlist.add(0, "New added item");
        linkedlist.remove(2);
        System.out.println("Content: " + linkedlist);

        /*RESULT: Polled First: New added item
        Content after polling the first element: [Item1, Item3, Item4, Item5]*/
        System.out.println("Polled First: " + linkedlist.pollFirst());
        System.out.println("Content after polling the first element: " + linkedlist);

        /*RESULT: Polled Last: Item5
        Content after polling the last element: [Item1, Item3, Item4]*/
        System.out.println("Polled Last: " + linkedlist.pollLast());
        System.out.println("Content after polling the last element: " + linkedlist);
    }
}