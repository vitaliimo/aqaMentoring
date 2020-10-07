package lesson1.Homework_Answers;

public class Computer {
    private String brand;
    private String type;
    private int screenSize;
    private int cores;

    public Computer(String brand, int screenSize){
        this.brand = brand;
        this.screenSize = screenSize;
    }

    static class Main{
        public static void main(String[] args) {
            Computer computer1 = new Computer("Lenovo",15);
            Computer computer2 = new Computer("McBook",13);
        }
    }
}
