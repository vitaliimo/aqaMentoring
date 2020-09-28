package Lesson1.Daryna;

public class MainForComputerClass {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Apple", 13);
        Computer computer2 = new Computer("hp", 15.6);
        System.out.println("Info for computer1: "+computer1.getBrand()+" "+computer1.getScreenSize());
        System.out.println("Info for computer2: "+computer2.getBrand()+" "+computer2.getScreenSize());
    }
}
