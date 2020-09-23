package Lesson1.Svitlana;

import java.io.IOException;
import java.util.Scanner;

public class task3 {
    public static void main (String[] args)throws IOException {
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
        //test
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println(n1 + n2);
        thesecond(n1);
        thethird(n1);
    }

    private static void thesecond (int n3) {
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 - 24 = 101
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println(n1-n2);
    }

private static void thethird (int n3) {
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 x 24 = 3000
    Scanner scanner = new Scanner(System.in);
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    System.out.println(n1*n2);
}

//Input first number: 125
//Input second number: 24
//Expected Output :
//125 / 24 = 5
//125 mod 24 = 5
}
