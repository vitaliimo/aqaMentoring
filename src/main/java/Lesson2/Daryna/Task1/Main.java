package Lesson2.Daryna.Task1;

import java.util.Scanner;

public class Main {

    public static void randomVectArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a length of random vectors n = ");
        int n = in.nextInt();

        for (int i = 1; i <= 1 + (int) (Math.random() * 10); i++) {
            int arr[] = new int[n];
            System.out.print("Vector " + i + " = ");
            for (int j = 0; j < n; j++) {
                arr[j] = (int) (Math.random() * 10);
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 5, 2);
        vector1.lengthOfVector(vector1.getX(), vector1.getY(), vector1.getX());

        Vector vector2 = new Vector(2, 0, 3);
        vector1.scalarMult(vector1, vector2);

        randomVectArray();
    }
}
