package lesson2;

class Lesson2_1 {


    public abstract class Animal {
        public abstract void move();
        public abstract void fly();

        public String die() {
            return "Animal dead";
        }
    }

    public abstract class WalkingAnimal {
        public abstract void move();

        public String die() {
            return "Animal dead";
        }
    }


    public abstract class FlyingAnimal {
        public abstract void move();
        public abstract void fly();

        public String die() {
            return "Animal dead";
        }
    }

    class Dog extends WalkingAnimal {

        public void move() {
            System.out.println("top top");
        }
    }

    class Cat extends WalkingAnimal {

        public void move() {
            System.out.println("tip top");
        }
    }

    class Bird extends FlyingAnimal{

        public void move() {
            System.out.println("tip tip");
        }

        public void fly() {
            System.out.println("FLY!");
        }

    }


}