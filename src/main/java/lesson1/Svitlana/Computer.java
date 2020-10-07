package lesson1.Svitlana;

public class Computer {
    String brand;
    String screen_size;

    Computer() {
        brand = "HP";
        screen_size = "19d";
    }

    public static void main(String[] args) {
        Computer myComputer = new Computer();
        Computer myComp_1 = new Computer();
        System.out.println("Computer brand: " + myComputer.brand);
        System.out.println("Computer screen size: " + myComp_1.screen_size);
        myComputer.getType();
        myComp_1.getNumberOfCores();
    }
    public void getType () {
        String type = "Laptop";
        System.out.println("Computer type: " + type);
    }
    public void getNumberOfCores () {
        String numberOfCores = "5";
        System.out.println("Computer type: " + numberOfCores);
    }
}

