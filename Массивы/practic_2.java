import java.util.Arrays;

public class Practice02ArraysClass {
    public static void main(String[] args) {
        // Исходные данные
        int[] numbers = {5, 2, 8, 1, 9, 3};
        int[] numbersCopy = {5, 2, 8, 1, 9, 3};
        int[] different = {1, 2, 3};

        // 1. toString() — строковое представление массива
        System.out.println("=== toString() ===");
        System.out.println("Массив: " + Arrays.toString(numbers));

        // 2. sort() — сортировка по возрастанию
        System.out.println("\n=== sort() ===");
        Arrays.sort(numbers);
        System.out.println("Отсортированный: " + Arrays.toString(numbers));

        // 3. binarySearch() — двоичный поиск (только на отсортированном массиве!)
        System.out.println("\n=== binarySearch() ===");
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Индекс элемента 8: " + index);
        int notFound = Arrays.binarySearch(numbers, 100);
        System.out.println("Поиск 100 (нет в массиве): " + notFound); // отрицательное значение

        // 4. equals() — посимвольное сравнение двух массивов
        System.out.println("\n=== equals() ===");
        System.out.println("numbers == numbersCopy: " + Arrays.equals(numbers, numbersCopy)); // true
        System.out.println("numbers == different: " + Arrays.equals(numbers, different));     // false

        // 5. compare() — лексикографическое сравнение (возвращает -1, 0, 1)
        System.out.println("\n=== compare() ===");
        int[] first = {1, 2, 3};
        int[] second = {1, 2, 4};
        int[] third = {1, 2, 3};

        System.out.println("compare(first, second): " + Arrays.compare(first, second)); // -1 (first < second)
        System.out.println("compare(second, first): " + Arrays.compare(second, first)); // 1  (second > first)
        System.out.println("compare(first, third): " + Arrays.compare(first, third));   // 0  (равны)

        // Бонус: fill(), copyOf(), asList()
        System.out.println("\n=== Бонус ===");
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("fill(7): " + Arrays.toString(filled));

        int[] copied = Arrays.copyOf(numbers, 4);
        System.out.println("copyOf(4): " + Arrays.toString(copied));

        // Преобразование массива в список (только для объектов!)
        Integer[] boxed = {1, 2, 3};
        System.out.println("asList: " + Arrays.asList(boxed));
    }
}