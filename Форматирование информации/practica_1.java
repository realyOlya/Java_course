import java.util.Formatter;


public class FormatterSpecifiersDemo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        // 1. %b – логическое значение
        boolean flag = true;
        formatter.format("1. Логическое значение: %b%n", flag);
        // false выводится как false, null как false

        // 2. %c – символ
        char ch = 'A';
        formatter.format("2. Символ: %c%n", ch);

        // 3. %d – десятичное целое
        int number = 42;
        formatter.format("3. Целое число: %d%n", number);

        // 4. %f – число с плавающей точкой
        double pi = 3.1415926;
        formatter.format("4. Число с плавающей точкой: %.2f%n", pi); // с двумя знаками после запятой

        // 5. %s – строковое представление
        String text = "Hello, Java!";
        formatter.format("5. Строка: %s%n", text);

        System.out.println(formatter);
        formatter.close();
    }
}