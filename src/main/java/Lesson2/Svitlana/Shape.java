package Lesson2.Svitlana;

import java.util.Scanner;

public class Shape {
    public double volume;

    public static void main(String[] args) {
        Shape newShape = new Shape();
        newShape.setVolume();
        newShape.getVolume();
    }

    public void setVolume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input volume");
        volume = scanner.nextDouble();
    }

    public void getVolume() {
        System.out.println("Volume of the shape = " + volume);
    }
}