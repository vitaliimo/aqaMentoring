package lesson3;

import java.util.*;

public class Lesson_Generics {
    //В данном случае метод принимает на вход 2 параметра: список объектов T и еще один отдельный объект Т.
    public static <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++)
            list.set(i, val);
    }

    //Назначив для него при создании тип данных (<T>), мы уже не сможем помещать в него объекты других типов.
    public static class Box<T> {
        private T t;

        public void set(T t) {
            this.t = t;
        }

        public T get() {
            return t;
        }
    }

    public static void main(String[] args) {
        //Дженерики — это типы с параметром
        //java.lang.ClassCastException
        List<String> myList1 = new ArrayList<>();
        myList1.add("Test String 1");
        myList1.add("Test String 2");

//Типизированные методы
        List<String> strings = new ArrayList<>();
        strings.add("Старая строка 1");
        strings.add("Старая строка 2");
        strings.add("Старая строка 3");
        fill(strings, "Новая строка");
        System.out.println(strings);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        fill(numbers, 888);
        System.out.println(numbers);

//Типизированные классы
        Box<String> stringBox = new Box<>();
        stringBox.set("Старая строка");
        System.out.println(stringBox.get());
        stringBox.set("Новая строка");
        System.out.println(stringBox.get());
        //stringBox.set(12345);//ошибка компиляции!


        //типобезопасность
        //Если класс B является наследником класса А, то Collection<B> при этом — не наследник Collection<A>.
        String str = new String("Test!");
        // никаких проблем
        Object obj = str;

        List<String> stringss = new ArrayList<String>();
        // ошибка компиляции!
        // List<Object> objects = stringss;

        //wildcards
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet());
        pets.add(new Pet());
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        iterateAnimals(animals);
        iterateAnimals(pets);
        iterateAnimals(cats);

    }


    public static class Animal {
        public void feed() {
            System.out.println("Animal.feed()");
        }
    }

    public static class Pet extends Animal {
        public void call() {
            System.out.println("Pet.call()");
        }
    }

    public static class Cat extends Pet {
        public void meow() {
            System.out.println("Cat.meow()");
        }
    }

    //почему тут ошибка?
//        public static void iterateAnimals(Collection<Animal> animals) {
//
//            for(Animal animal: animals) {
//
//                System.out.println("Еще один шаг в цикле пройден!");
//            }
//        }

    //Upper Bounded Wildcards
    //метод принимает на вход коллекцию объектов класса Animal либо объектов любого класса-наследника Animal (? extends Animal)
    public static void iterateAnimals(Collection<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println("Еще один шаг в цикле пройден!");
        }
    }

    //Lower Bounded Wildcards
    //iterateAnimals2() может принимать на вход коллекцию объектов класса Cat либо любого другого класса-предка Cat.
    public static void iterateAnimals2(Collection<? super Cat> animals) {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Еще один шаг в цикле пройден!");
        }
    }
}
