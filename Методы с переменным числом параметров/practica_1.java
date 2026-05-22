public class VarargsOverloadDemo {

    // 1. Метод для суммирования целых чисел
    public static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // 2. Перегруженный метод для суммирования чисел с плавающей точкой
    public static double sum(double... numbers) {
        double total = 0.0;
        for (double n : numbers) {
            total += n;
        }
        return total;
    }

    // 3. Перегрузка: фиксированный параметр + varargs (допустимо, сигнатура отличается)
    public static int sum(int seed, int... numbers) {
        int total = seed;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // 4. Перегрузка: другой тип varargs + обычный параметр (порядок важен)
    public static void print(String prefix, Object... items) {
        System.out.print(prefix + ": ");
        for (Object obj : items) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    // 5. Перегрузка: только varargs Object (без префикса)
    public static void print(Object... items) {
        for (Object obj : items) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Демонстрация перегрузки sum
        System.out.println("sum(int...): " + sum(1, 2, 3));          // 6
        System.out.println("sum(double...): " + sum(1.5, 2.5, 3.0)); // 7.0
        System.out.println("sum(int, int...): " + sum(10, 20, 30));  // 60

        // Демонстрация перегрузки print
        print("Numbers", 1, 2, 3);        // Numbers: 1 2 3
        print("Hello", "World", "!");     // Hello: Hello World !
        print(100, 200, 300);             // 100 200 300 (вызван print(Object...))
        print("Just one string");         // Just one string (вызван print(Object...))
    }
}