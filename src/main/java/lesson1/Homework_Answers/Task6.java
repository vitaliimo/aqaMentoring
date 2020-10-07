package lesson1.Homework_Answers;

import java.util.Arrays;

public class Task6 {

    public static String concatAndRemoveP(String string1, String string2) {
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();

        for (int i = 0; i < chars1.length; i++) {
            if ((chars1[i] == 'P') || (chars1[i] == 'p'))
                chars1[i] = ' ';
        }

        for (int i = 0; i < chars2.length; i++) {
            if ((chars1[i] == 'P') || (chars1[i] == 'p'))
                chars1[i] = ' ';
        }

        String s = Arrays.toString(chars1);

        return new String(chars1) + new String(chars2);
    }

    public static void main(String[] args) {
        String string1 = "PHP Exercises and";
        String string2 = "Python Exercises";

        System.out.println(concatAndRemoveP(string1, string2));
    }
}
