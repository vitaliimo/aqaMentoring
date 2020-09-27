package Lesson1.Denis;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Please input only integer numbers to make their sum");
        System.out.print("A=");
        Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
        System.out.print("B=");
            int B = scanner.nextInt();
            int C=A+B;
        System.out.println("A+B="+C);

    }
}
