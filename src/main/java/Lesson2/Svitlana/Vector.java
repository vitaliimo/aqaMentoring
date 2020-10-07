package Lesson2.Svitlana;

import java.util.Scanner;

public class Vector {
    private int vectorX;
    private int vectorY;
    private int vectorZ;

    public Vector() {
        vectorX = 10;
        vectorY = 20;
        vectorZ = 30;
    }

    public double lengthOfTheVector() {
        return (Math.sqrt(vectorX ^ 2 + vectorY ^ 2 + vectorZ ^ 2));
    }

    public double scalarProduct(int x2, int y2, int z2) {
        return (vectorX * x2 + vectorY * y2 + vectorZ * z2);
    }

    public int[] massVectors(int x2, int y2, int z2) {
//        double[] massVectors = new double[n];
//        for (int i = 0; i < n; i++) {
//            massVectors[i] = Math.random();
//        }
        int[] massVectors = {vectorX, vectorY, vectorZ, x2, y2, z2};
        return massVectors;
    }

    public static void main(String[] args) {
        Vector newVector = new Vector();
        System.out.println("Length of the Vector = " + newVector.lengthOfTheVector());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter values for X2:");
        System.out.print("X2 = ");
        int x2 = scanner.nextInt();
        System.out.print("Y2 = ");
        int y2 = scanner.nextInt();
        System.out.print("Z2 = ");
        int z2 = scanner.nextInt();
        System.out.println("Scalar Product with X1 = " + newVector.vectorX + " Y1 = " + newVector.vectorZ + " Z1 = " + newVector.vectorZ
                + " is equal " + (newVector.scalarProduct(x2, y2, z2)));

        System.out.print(newVector.massVectors(x2, y2, z2));
    }
}
