package Lesson1.Daryna;

import java.util.Scanner;

public class Task3 {

    public static void addition(int a, int b) {
        int sumRes = a + b;
        System.out.println(sumRes);
    }

    public static void multiply(int a, int b) {
        int multRes = a * b;
        System.out.println(multRes);
    }

    public static void subtract(int a, int b) {
        int subtrRes = a - b;
        System.out.println(subtrRes);
    }

    public static void divide(int a, int b) {
        int divRes = a / b;
        System.out.println(divRes);
    }

    public static void remainder(int a, int b) {
        int remRes = a % b;
        System.out.println(remRes);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the 1st number:");
        int a = in.nextInt();
        System.out.println("Input the 2nd number:");
        int b = in.nextInt();

        addition(a, b);
        multiply(a, b);
        subtract(a, b);
        divide(a, b);
        remainder(a, b);

    }
}
