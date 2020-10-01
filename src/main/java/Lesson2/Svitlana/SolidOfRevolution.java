package Lesson2.Svitlana;

import java.util.Scanner;

public class SolidOfRevolution extends Shape {
    public double radius;

    public static void main(String[] args) {
        SolidOfRevolution newSolidOfRevolution = new SolidOfRevolution();
        newSolidOfRevolution.setRadius();
        newSolidOfRevolution.getRadius();
    }

    public void setRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Radius");
        radius = scanner.nextDouble();
    }

    public void getRadius() {
        System.out.println("Volume of the Radius = " + radius);
    }
}
