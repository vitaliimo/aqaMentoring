package lesson3.Daryna;

import java.util.*;

public class Task1 {

    public static Map<Character, Integer> fromStringToMap(String text) {
        char[] textAsArray = new char[text.length()];
        textAsArray = text.toCharArray();


        Map<Character, Integer> symbolAndNumberOfThis = new HashMap<>();

        List<Character> arrayWithText = new ArrayList<Character>(text.length());

        for (int i = 0; i < text.length(); i++) {
            arrayWithText.add(textAsArray[i]);
        }

        List<Character> copyOfArrayWithText = new ArrayList<Character>(text.length());
        copyOfArrayWithText.addAll(arrayWithText);


        for (int i = 0; i < text.length(); i++) {
            int count = 1;

            if ((i != text.length() - 1) && arrayWithText.get(i) != arrayWithText.get(i + 1)) {
                for (int j = 0; j < text.length(); j++) {

                    if (arrayWithText.get(i) == copyOfArrayWithText.get(j) && (i != j)) {
                        count++;
                    } else continue;

                }
                symbolAndNumberOfThis.put(arrayWithText.get(i), count);
            } else continue;
        }
        return symbolAndNumberOfThis;
    }

    public static void main(String[] args) {

        String text = "jjsssssddddjj";
        Map<Character, Integer> symbolAndNumberOfThis = fromStringToMap(text);

        for (Map.Entry<Character, Integer> entry : symbolAndNumberOfThis.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}



