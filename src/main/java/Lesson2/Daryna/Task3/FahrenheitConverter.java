package Lesson2.Daryna.Task3;

public class FahrenheitConverter implements Converter {
    public double convert(double tempInC) {
       return tempInC * 1.8 + 32;

    }
}
