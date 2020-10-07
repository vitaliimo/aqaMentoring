package Lesson2.Svitlana;

import java.util.Scanner;

public class Vector {
    private int vectorX;
    private int vectorY;
    private int vectorZ;

    public Vector(int x1, int y1, int z1) {
        this.vectorX = x1;
        this.vectorY = y1;
        this.vectorZ = z1;
    }

    public double lengthOfTheVector() {

        return (Math.sqrt(vectorX ^ 2 + vectorY ^ 2 + vectorZ ^ 2));
    }

    public double scalarProduct(int x2, int y2, int z2) {

        return (vectorX * x2 + vectorY * y2 + vectorZ * z2);
    }

    public static Vector[] massVectors(int n) {
        Vector arrVectors[] = new Vector[n];
        for (int i = 0; i < n; i++) {
            arrVectors[i] = new Vector((int)(Math.random()*10),(int) (Math.random()*10),(int)(Math.random()*10));
            System.out.print(arrVectors[i]);
        }

        return arrVectors;
    }
    @Override
    public String toString() {
        return "Vector{" +
                "x=" + vectorX +
                ", y=" + vectorY +
                ", z=" + vectorZ +
                '}';
    }

    public static void main(String[] args) {
        Vector newVector = new Vector(10, 15, 20);
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
        massVectors(5);
    }
}
