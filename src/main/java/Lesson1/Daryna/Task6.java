package Lesson1.Daryna;

public class Task6 {
    public static char[] concatAndTransformationInArrChar(String string1, String string2) {
        String string3 = string1 + string2;
        //System.out.println(string3);

        char[] arr = new char[string3.length()];
        for (int i = 0; i <= string3.length() - 1; i++) {
            //System.out.println(string3.charAt(i));

            arr[i] = string3.charAt(i);
        }
        return arr;
        //System.out.println(count);

    }

    public static int lenghtCountForNewArray(char[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P' || arr[i] == 'p') {
                count++;
            }
        }
        // System.out.println(count);
        return count;
    }


    public static void withoutPLetter(char[] arr, int count) {
        char[] arr1 = new char[arr.length - count];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P' || arr[i] == 'p') {
                continue;
            } else arr1[j] = arr[i];
            System.out.print(arr1[j]);
        }


    }


    public static void main(String[] args) {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        char[] arr = concatAndTransformationInArrChar(str1, str2);
        int count = lenghtCountForNewArray(arr);
        withoutPLetter(arr, count);


    }
}
