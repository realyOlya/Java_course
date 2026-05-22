import java.util.*;

/**
 * Практика #2: Примеры использования <? extends T> и <? super T>.
 * Эти wildcard'ы нужны для гибкой и типобезопасной работы с коллекциями.
 * extends – для чтения (producer), super – для записи (consumer).
 */
public class Practice2 {

    // Пример с <? extends T> – метод читает данные
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        // list.add(42); // Ошибка компиляции: нельзя добавить элемент (кроме null)
        return sum;
    }

    // Пример с <? super T> – метод записывает данные
    public static void fillWithIntegers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i); // можно добавлять Integer и его наследников
        }
        // Integer first = list.get(0); // Ошибка: тип – Object, нужен приведение
        Object obj = list.get(0); // читается как Object
    }

    // Пример комбинации (PECS: Producer Extends, Consumer Super)
    public static <T> void copy(List<? extends T> src, List<? super T> dest) {
        for (T item : src) {
            dest.add(item);
        }
    }

    public static void main(String[] args) {
        // Демонстрация <? extends Number>
        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println("Сумма ints: " + sumNumbers(ints));     // 6.0
        System.out.println("Сумма doubles: " + sumNumbers(doubles)); // 7.5

        // Демонстрация <? super Integer>
        List<Number> numbers = new ArrayList<>();
        fillWithIntegers(numbers);
        System.out.println("Numbers после fill: " + numbers); // [1,2,3,4,5]

        List<Object> objects = new ArrayList<>();
        fillWithIntegers(objects);
        System.out.println("Objects после fill: " + objects); // [1,2,3,4,5]

        // Демонстрация copy
        List<String> src = Arrays.asList("A", "B", "C");
        List<Object> dest = new ArrayList<>();
        copy(src, dest);
        System.out.println("После copy: " + dest); // [A, B, C]
    }
}