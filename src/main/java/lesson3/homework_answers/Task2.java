package lesson3.homework_answers;

import java.util.Collection;
import java.util.TreeSet;

public class Task2 {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new TreeSet<>(collection);
    }

    public static void main(String[] args) {

    }
}
