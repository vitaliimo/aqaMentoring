package Lesson2.Daryna.Task1;

import java.util.Scanner;

public class Main {

    public static Vector[] randomVectArray(int n) {
        Vector arrOfVectors[] = new Vector[n];

        for (int i = 1; i < n; i++) {
            arrOfVectors[i] = new Vector((int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10));
            System.out.println(arrOfVectors[i]);
        }
        return arrOfVectors;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a length of random vectors n = ");
        int n = in.nextInt();
        randomVectArray(n);

        Vector vector1 = new Vector(1, 5, 2);

        vector1.lengthOfVector();

        Vector vector2 = new Vector(2, 0, 3);
        vector1.scalarMult(vector2);


    }
}
