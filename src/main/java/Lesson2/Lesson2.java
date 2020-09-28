package Lesson2;

public class Lesson2 {
    static class Vehicle {
        int passengers;
        int fuelcap;
        int mpg;
    }

    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int rangel, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        rangel = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println(minivan.passengers + " пассажиров и " + rangel + " миль");
        System.out.println(sportscar.passengers + " пассажиров и " + range2 + " миль");
    }
}

