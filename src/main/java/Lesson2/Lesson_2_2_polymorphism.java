package Lesson2;

public class Lesson_2_2_polymorphism {

    public static void main(String[] args) {
        Tenis tenis = new Tenis();
        TableTennis tenis1 = new TableTennis();

        tenis.play("d","d");

        tenis1.play();
        tenis1.play("d","d");
    }


    static class Tenis {
        String player1;
        String player2;

        public Tenis(String p1, String p2) {
            System.out.println("instanse is created");
        }

        public Tenis() {
            System.out.println("Tenis instanse is created");
        }

        public void play (String p1, String p2){
            System.out.println(p1 + p2 + "Game started");
        }
    }

    static class TableTennis extends Tenis{

        public TableTennis() {
            System.out.println("TableTennis instanse is created");
        }

        //перегружен
        public void play() {
            System.out.println("table tennis is better");
        }

        //переопределен
        @Override
        public void play (String p1, String p2){
            System.out.println(p1 + p2 + "  Table tennis ame started Override");
        }
    }

}
