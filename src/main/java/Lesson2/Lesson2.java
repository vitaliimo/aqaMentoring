package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson2 {

    static class Vehicle {
        int passengers;
        int fuelcap;
        int mpg;
    }

    static class Round {
        private final double pi = 3.14;
        public double radius;

        public Round(double radius) {
            this.radius = radius;
        }


        Round() {
        }

        public double radiusRound(Round round1) {
            explain();
            return pi * round1.radius;
        }

        private void explain() {
            System.out.println("Radius = pi * r^2");
        }

    }

/*  Ag

    class Engine {
    }

    class Car {
        Engine e;
        public Car(Engine e) {
            this.e = e
        }
    }
*/

    class Engine {
    }

    class Car {
        Engine e = new Engine();
    }


    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String d = "";

        Round round111 = new Round(43);


        System.out.println(round111.radiusRound(round111));

//        //Ag
//        Engine e = new Engine();
//        Car car = new Car(e);
//
//        //Comp
//        Car car = new Car();
//        Engine e2 = new Engine();


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

