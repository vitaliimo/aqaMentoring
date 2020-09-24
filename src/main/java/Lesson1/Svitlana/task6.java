package Lesson1.Svitlana;

public class task6 {
    public static void main (String [] args) {
//String 1: PHP Exercises and
//String 2: Python Exercises
//Expected output:
//The concatenated string with replacements: H Exercises and ython Exercises
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        String output = str1.concat(str2);
        System.out.println(output);
        String replace = output.replace("P","");
        String replace1 = replace.replace("p","");
        System.out.println(replace1);
    }
}
