package lesson3.Svitlana.Task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class CollectionOfObjects {

    public static <String> Collection<String> collectionWithoutDuplicates(ArrayList<String> arrayListWithDupl) {
        Object[] listWithDupls = arrayListWithDupl.toArray();
        for (Object s : listWithDupls) {
            if (arrayListWithDupl.indexOf(s) != arrayListWithDupl.lastIndexOf(s)) {
                arrayListWithDupl.remove(arrayListWithDupl.lastIndexOf(s));
            }
        }
        System.out.println("List without duplicates: " + arrayListWithDupl);
        return arrayListWithDupl;
    }

    public static void main(String[] arg) {
        ArrayList<String> listDuplicates = new ArrayList<String>();
        listDuplicates.add("Test 1");
        listDuplicates.add("Test 2");
        listDuplicates.add("Test 4");
        listDuplicates.add("Test 2");
        listDuplicates.add("Test 5");

        System.out.println("List with Duplicates " + listDuplicates);
        collectionWithoutDuplicates(listDuplicates);
    }
}
