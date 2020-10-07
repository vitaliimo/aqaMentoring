package lesson2.Homework_Answers;

public class Task3 {
    interface Converter {
        double getConvertedValue(double baseValue);
    }

    static class CelsiusConverter implements Converter {
        public double getConvertedValue(double baseValue) {
            return baseValue;
        }
    }

    static class KelvinConverter implements Converter {
        public double getConvertedValue(double baseValue) {
            return baseValue + 273.15;
        }
    }

    static class FahrenheitConverter implements Converter {
        public double getConvertedValue(double baseValue) {
            return 1.8 * baseValue + 32;
        }
    }
}

class Main {
    public static void main(String[] args) {
        double temperature = 23.5;
        System.out.println("t = " +
                new Task3.CelsiusConverter().getConvertedValue(temperature));
        System.out.println("t = " +
                new Task3.KelvinConverter().getConvertedValue(temperature));
        System.out.println("t = " +
                new Task3.FahrenheitConverter().getConvertedValue(temperature));
    }
}
