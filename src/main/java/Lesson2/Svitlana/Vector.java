package Lesson2.Svitlana;

import java.util.Scanner;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x1, int y1, int z1) {
        this.x = x1;
        this.y = y1;
        this.z = z1;
    }

    public double lengthOfTheVector() {

        return (Math.sqrt(x ^ 2 + y ^ 2 + z ^ 2));
    }

    public double scalarProduct(Vector vector2) {
       // newVector.scalarProduct(newVector2);
        return (x * vector2.x + y * vector2.y + z * vector2.z);
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
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Vector newVector = new Vector(10, 15, 20);
        Vector newVector2 = new Vector(12, 18, 20);
        newVector.scalarProduct(newVector2);
        System.out.println("Length of the Vector = " + newVector.lengthOfTheVector());

        System.out.println("Scalar Product with X1 = " + newVector.x + " Y1 = " + newVector.z + " Z1 = " + newVector.z
                + " is equal " + (newVector.scalarProduct(newVector2)));
        massVectors(5);
       // System.out.println(newVector.toString());
    }
}
