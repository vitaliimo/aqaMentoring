package Lesson2.Daryna.Task3;

public class FahrenheitConverter implements Converter {
    public void convert(double tempInC) {
        System.out.println(tempInC * 1.8 + 32 + " °F");

    }
}
