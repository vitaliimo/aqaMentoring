package lesson2;

class Lesson2_1_Solution {

    public interface isMammal{
        boolean isMammal();
    }

    public interface flyable {
        void fly();
    }

    public interface walkable {
        void walk();
    }

    public abstract class Animal {
        public String die() {
            return "Animal dead";
        }
    }


    class Dog extends Animal implements walkable, isMammal {

        public void move() {
            System.out.println("top top");
        }

        public void walk() {

        }

        public boolean isMammal() {
            return true;
        }
    }

    class Cat extends Animal {

        public void move() {
            System.out.println("tip top");
        }
    }

    class Bird extends Animal implements flyable,walkable {

        public void move() {
            System.out.println("tip tip");
        }

        public void fly() {
            System.out.println("FLY!");
        }

        public void walk() {

        }
    }


}