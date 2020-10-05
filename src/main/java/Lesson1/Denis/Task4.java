package Lesson1.Denis;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int num[] = new int[]{5, 6, 7, 12, -5, 32, 43};
        int Sum = 0;
        for (int i = 0; i < num.length; i++) {
            Sum = num[i] + Sum;
        }

        System.out.println("Sum of all elements = " + Sum);

    }
}
