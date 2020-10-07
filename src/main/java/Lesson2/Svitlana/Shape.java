package Lesson2.Svitlana;

import java.util.Scanner;

public class Shape {
    private static double volume;

    public double getVolume() {

        return volume;
    }

    public static void main(String[] args) {
        Shape newShape = new Shape();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input volume");
        volume = scanner.nextDouble();
        System.out.println("Volume of the shape = " + newShape.getVolume());
    }
}

class SolidOfRevolution extends Shape {
    private static double radius;

    public SolidOfRevolution() {

        radius = 10;
    }

    public double getRadius() {

        return radius;
    }

    public static void main(String[] args) {
        SolidOfRevolution newSolidOfRevolution = new SolidOfRevolution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Radius");
        radius = scanner.nextDouble();
        System.out.println("Volume of the Radius = " + newSolidOfRevolution.getRadius());
    }
}

class Pyramid extends Shape {
    private static double s;
    private static double h;

    public double getH() {
        return h;
    }

    public double getS() {
        return s;
    }

    public static void main(String[] args) {
        Pyramid newPyramid = new Pyramid();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input h value");
        System.out.println("h = ");
        h = scanner.nextDouble();
        System.out.println(newPyramid.getH());

        System.out.println("Please input s value");
        System.out.println("s = ");
        s = scanner.nextDouble();
        System.out.println(newPyramid.getS());
    }
}