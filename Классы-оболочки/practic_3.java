public class class_shell_Practic_3 {
    public static void main(String[] args) {
        // Ситуация 1: Прямое присваивание
        Integer nullableCount = null;
        try {
            int count = nullableCount; // ОШИБКА: Автораспаковка null в int
        } catch (NullPointerException e) {
            System.out.println("1. Поймали NPE при присваивании примитиву");
        }

        // Ситуация 2: Арифметические операции
        Integer a = null;
        Integer b = 10;
        try {
            int sum = a + b; // ОШИБКА: Чтобы сложить, Java пытается сделать a.intValue()
        } catch (NullPointerException e) {
            System.out.println("2. Поймали NPE при сложении");
        }

        // Ситуация 3: Тернарный оператор
        boolean flag = true;
        Double value = null;
        try {
            // Если одна часть тернарного оператора примитив,
            // вторая тоже будет распакована
            double result = flag ? value : 1.0;
        } catch (NullPointerException e) {
            System.out.println("3. Поймали NPE в тернарном операторе");
        }
    }
}