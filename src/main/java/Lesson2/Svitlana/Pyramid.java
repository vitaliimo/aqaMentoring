package Lesson2.Svitlana;

import java.util.Scanner;

public class Pyramid extends Shape {
    public double s;
    public double h;

    public void setH() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input h value");
        System.out.println("h = ");
        h = scanner.nextDouble();
    }

    public double getH() {
        return h;
    }

    public void setS() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input s value");
        System.out.println("s = ");
        s = scanner.nextDouble();
    }

    public double getS() {
        return s;
    }

    public static void main(String[] args) {
        Pyramid newPyramid = new Pyramid();
        newPyramid.setH();
        newPyramid.getH();
        newPyramid.setS();
        newPyramid.getS();
    }
}