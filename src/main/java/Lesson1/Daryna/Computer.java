package Lesson1.Daryna;

public class Computer {
    private String brand;
    private double screenSize;
    private int numberOfCore;
    private String type;

    public Computer(String brand, double screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public double getScreenSize() {
        return screenSize;
    }
}
