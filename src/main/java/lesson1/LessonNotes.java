package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LessonNotes {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println(n1 + n2);
        fibo(n1);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int ie = Integer.parseInt(reader.readLine());


        // variable
        double var = 10;
        var = 5;

        String str1 = "hello";
        String str2 = "world";
        str1 = str2;
        System.out.println(str1);
        System.out.println(str2);

        // mas


        int a1 = 255;


        int a2 = 15000;
        if (a2 < 324) {
            System.out.println("privet");
        } else if (a2 < 1000) {
            System.out.println("wally");
        } else if (a2 > 100) {
            System.out.println("reert");
        }

        while (a1 < 260) {
            System.out.println(a1);
            a1++;
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        do {
            System.out.println(23);
            a1++;
        } while (a1 < 260);

        String string1 = "hello";
        String s2 = "hello";


    }


    private static void fibo(int n) {
        if (n == 1)
            System.out.println(1);
        else {

            int[] mas = new int[n];
            mas[0] = 1;
            mas[1] = 1;

            for (int i = 2; i < n; i++) {
                mas[i] = mas[i - 1] + mas[i - 2];
            }

            System.out.println(mas[n - 1]);
        }
    }
}