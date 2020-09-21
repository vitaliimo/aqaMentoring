package Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LessonNotes {
    public static void main(String[] args) throws IOException {
        /*
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fibo(n);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int ie = Integer.parseInt(reader.readLine());
        */

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