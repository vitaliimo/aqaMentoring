package lesson3.homework_answers;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static Map<Character, Integer> buildCharacterDictionaryFormString(String text) {
        char[] charTextArray = text.toCharArray();
        Map<Character, Integer> dictionary = new HashMap<>();
        for (char c : charTextArray) {
            if (dictionary.containsKey(c)) {
                dictionary.put(c, dictionary.get(c) + 1);
//   можна так             map.replace(c, map.get(c) + 1);
            } else dictionary.put(c, 1);
        }
        return dictionary;
    }

    public static void main(String[] args) {
        String justText = "yyyyyuuuuiiijioyrtt";
        Map<Character, Integer> dictionary = buildCharacterDictionaryFormString(justText);
        System.out.println(dictionary);
        for (Map.Entry<Character, Integer> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
