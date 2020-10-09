package lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lesson_HashMap {
    public static void main(String[] args) {
        //реализация
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        //Добавление новой пары в HashMap
        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");
        System.out.println(passportsAndNames);

        //Особенности ключей HashMap
        passportsAndNames.put(162348, "Виктор Михайлович Стычкин");//повторный ключ

        //методы get() и remove()
        String lidiaName = passportsAndNames.get(212133);
        System.out.println(lidiaName);
        passportsAndNames.remove(162348);
        System.out.println(passportsAndNames);

        //Проверка наличия ключа и значения
        System.out.println(passportsAndNames.containsKey(11111));

        //Получение списка всех ключей и значений
        //Ключи извлекаются в коллекцию Set. Ее особенность в том, что в ней не может быть повторяющихся элементов
        Set<Integer> keys = passportsAndNames.keySet();
        System.out.println("Ключи: " + keys);
        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
        System.out.println("Значения: " + values);

        // size() возвращает число элементов в словаре на текущий момент
        // clear() — удаляет все элементы.
        System.out.println(passportsAndNames.size());
        passportsAndNames.clear();
        System.out.println(passportsAndNames);

        //Для проверки того, есть ли в нашей HashMap хотя бы один элемент
        if (!passportsAndNames.isEmpty()) {
            System.out.println(passportsAndNames);
        }

        //Объединение двух мап в одну
        HashMap<Integer, String> passportsAndNames1 = new HashMap<>();
        HashMap<Integer, String> passportsAndNames2 = new HashMap<>();
        passportsAndNames1.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames1.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames1.put(8082771, "Дональд Джон Трамп");
        passportsAndNames2.put(917352, "Алексей Андреевич Ермаков");
        passportsAndNames2.put(925648, "Максим Олегович Архаров");
        passportsAndNames.putAll(passportsAndNames2);
        System.out.println(passportsAndNames1);

        // перебор HashMap в цикле
        for (Map.Entry entry : passportsAndNames.entrySet()) {
            System.out.println(entry);
        }
    }
}
