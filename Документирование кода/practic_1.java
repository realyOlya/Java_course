/**
 * Класс для демонстрации работы с комментариями и утилитой Javadoc.
 *
 * @author Антонова Ольга
 * @version 1.0
 * @since 2026-05-22
 */
public class Practice01JavadocExample {

    /** Константа для максимального значения счета */
    public static final int MAX_SCORE = 100;

    /**
     * Вычисляет сумму двух целых чисел.
     *
     * @param firstValue  первое слагаемое
     * @param secondValue второе слагаемое
     * @return сумма аргументов
     * @see Practice01JavadocExample#calculateProduct(int, int)
     */
    public int calculateSum(int firstValue, int secondValue) {
        // Однострочный комментарий: простая арифметика
        return firstValue + secondValue;
    }

    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Practice01JavadocExample demo = new Practice01JavadocExample();

        // Демонстрация работы методов
        int sumResult = demo.calculateSum(10, 20);
        System.out.println("Сумма: " + sumResult);


    }
}