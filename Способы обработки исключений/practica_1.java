/**
 * В методе main генерируются два исключения:
 * 1. ArithmeticException (деление на ноль) – перехватывается в блоке try-catch.
 * 2. NullPointerException – не перехватывается, приводит к аварийной остановке программы.
 */
public class ExceptionCatchDemo {

    public static void main(String[] args) {
        // Часть 1: Исключение, которое будет перехвачено
        try {
            int result = 10 / 0; // генерирует ArithmeticException
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Исключение перехвачено: " + e);
            System.out.println("Продолжаем выполнение после catch.");
        }

        // Часть 2: Исключение, которое НЕ будет перехвачено
        // Создаём ситуацию для NullPointerException
        String str = null;
        int length = str.length(); // здесь генерируется NullPointerException
        // Эта строка не выполнится, программа аварийно завершится
        System.out.println("Длина строки: " + length);
    }
}