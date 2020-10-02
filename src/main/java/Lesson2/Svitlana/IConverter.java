package Lesson2.Svitlana;


import java.util.Scanner;

interface IConverter {
    int constanta1 = 32;
    double constanta2 = 1.8;

    public void convert(int degree);
}


class CelsiiConverter implements IConverter {

    public void convert(int celsii) {
        System.out.println("Degree of Kelvin Fahrenheit = " + celsii * constanta2 + constanta1);
    }

    public static void main(String[] args) {
        CelsiiConverter newCelsiiConverter = new CelsiiConverter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a degree of Celsii: ");
        int celsii = scanner.nextInt();
        newCelsiiConverter.convert(celsii);
    }
}


class FarenheitConverter implements IConverter {

    public void convert(int farenheit) {
        System.out.println("Degree of Celsii = " + ((farenheit - constanta1) / constanta2));
    }

    public static void main(String[] args) {
        FarenheitConverter newFarenheitConverter = new FarenheitConverter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a degree of Kelvin Farenheit: ");
        int kelvin = scanner.nextInt();
        newFarenheitConverter.convert(kelvin);
    }
}