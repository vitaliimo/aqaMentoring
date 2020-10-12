package lesson3.Svitlana.Task0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListDemo {
    public static void main(String[] args) {
        int positiveCount = 0;
        int size = 0;

//Declare and initialize a collection
        ArrayList<Double> list = new ArrayList<Double>();

// Fill the collection
        for (int i = 0; i < 10; i++) {
            Double d = new Random().nextGaussian();
            list.add(d);
        }
// Show the collection
        /*RESULT: Collection is:
         -0.01 0.88 0.35 -0.89 2.27 0.11 -0.64 0.04 -2.59 -0.32 */
        System.out.println("Collection is: ");
        for (Double d : list) {
            System.out.printf("%.2f ", d);
        }

        size = list.size();
//Get Iterator
        Iterator<Double> it = list.iterator();
// if the next element exists, get current and go to the next one
        while (it.hasNext()) {
            if (it.next() > 0)
                positiveCount++;
            else
                it.remove();
        }

        System.out.printf("%n Numbers that > 0 (count): %d", positiveCount);
        System.out.printf("%n Number that <=0 (count):", size - positiveCount);

        System.out.println("\n The updated collection: ");

        for (Double d : list) {
            System.out.printf("%.2f ", d);
        }
    }
}
