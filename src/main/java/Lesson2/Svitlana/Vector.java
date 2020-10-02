package Lesson2.Svitlana;

import java.util.Scanner;

public class Vector {
int vectorX;
int vectorY;
int vectorZ;

    public Vector(int x, int y, int z){
        vectorX = x;
        vectorY = y;
        vectorZ = z;
    }

 public void lengthOfTheVector (){
     System.out.println("Length of the Vector = " + Math.sqrt(vectorX^2 + vectorY^2 + vectorZ^2));
 }

 public  void scalarProduct() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter values for X1 and X2:");
     System.out.print("X2 = ");
     int x2 = scanner.nextInt();
     System.out.print("Y2 = ");
     int y2 = scanner.nextInt();
     System.out.print("Z2 = ");
     int z2 = scanner.nextInt();
     System.out.println("Scalar Product = " + (vectorX*x2+vectorY*y2+vectorZ*z2));
 }

    static void massVectors (int n) {
        int[] mass = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(Math.random() + " ");
        }

 }

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter values for X Y Z:");
     System.out.print("X1 = ");
     int x = scanner.nextInt();
     System.out.print("Y1 = ");
     int y = scanner.nextInt();
     System.out.print("Z1 = ");
     int z = scanner.nextInt();
        Vector newVector = new Vector(x, y, z);
        newVector.lengthOfTheVector();
        newVector.scalarProduct();
        massVectors(5);
    }
}
