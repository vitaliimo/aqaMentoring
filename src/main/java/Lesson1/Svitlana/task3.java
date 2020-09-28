package Lesson1.Svitlana;

import java.io.IOException;
import java.util.Scanner;

public class task3 {
    public static void main (String[] args)throws IOException {
//125 + 24 = 149
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("125 + 24 = 149 -> " + (n1 + n2));
        thesecond(n1);
        thethird(n1);
        theforth(n1);
        thefifth(n1);
    }

    private static void thesecond (int n3) {
//125 - 24 = 101
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println("125 - 24 = 101 -> " + (n1 - n2));
    }

private static void thethird (int n3) {
//125 x 24 = 3000
    Scanner scanner = new Scanner(System.in);
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    System.out.println("125 x 24 = 3000 -> " + (n1*n2));
}

    private static void theforth (int n3) {
//125 / 24 = 5
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("125 / 24 = 5 -> " + (n1/n2));
    }

    private static void thefifth (int n3) {
//125 mod 24 = 5
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("125 mod 24 = 5 -> " + (n1 % n2));
    }
}
